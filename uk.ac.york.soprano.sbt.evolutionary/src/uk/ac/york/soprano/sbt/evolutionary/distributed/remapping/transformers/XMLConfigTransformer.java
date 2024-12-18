package uk.ac.york.soprano.sbt.evolutionary.distributed.remapping.transformers;

import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import uk.ac.york.soprano.sbt.dsl.generated.TestingPackage.MRSPackage.XMLConfigLocation;
import uk.ac.york.soprano.sbt.evolutionary.distributed.accessors.FileAccessorFromDependency;
import uk.ac.york.soprano.sbt.evolutionary.distributed.accessors.FinaliseFailed;
import uk.ac.york.soprano.sbt.evolutionary.distributed.staticvariables.TransformFailed;
import uk.ac.york.soprano.sbt.evolutionary.distributed.staticvariables.operationexecutors.OperationExecutor;

public class XMLConfigTransformer extends ConfigTransformer {
	
	private static final boolean THROW_EXCEPTION_ON_LOOKUP_FAILURE = true;
	private static final boolean MULTIPLE_LOCATIONS_ALL_IDENTICAL = true;
	
	private XMLConfigLocation xmlVar;

	public XMLConfigTransformer(FileAccessorFromDependency accessor, XMLConfigLocation xmlVar) {
		super(accessor);
		this.xmlVar = xmlVar;
	}

	@Override
	public Optional<Object> transform(Random rng, OperationExecutor executor, Optional<Object> lastModified) throws TransformFailed, XPathLookupFailure {
		Transformer xformer;
		InputSource inputSource = accessor.getConfigFileInput(xmlVar);
		Optional<StreamResult> streamResult_o = accessor.getStreamForOutputResult(xmlVar);

		if (!streamResult_o.isPresent()) {
			System.err.println("Transform of static variable failed - could not create output stream for " + xmlVar.toString());
			throw new TransformFailed();
		} else {
			// Get the file from the source
			try {
				Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputSource);
				XPath xpath = XPathFactory.newInstance().newXPath();
				// Select the current value in the document
				String xpathExprStr = xmlVar.getXpathExpression();
				NodeList nodes = (NodeList) xpath.evaluate(xpathExprStr, doc, XPathConstants.NODESET);
				Object changedValue = null;
				Object changedElement = null;

				for (int idx = 0; idx < nodes.getLength(); idx++) {
					String originalString = nodes.item(idx).getTextContent();
					// Extract the string, e.g. specific space separated variables from it
					Object specificElement = extractString(xmlVar, originalString);
					// If a previous modified version from another location is present, use this instead
					if (lastModified.isPresent() && MULTIPLE_LOCATIONS_ALL_IDENTICAL) {
						changedElement = lastModified.get();
					} else {
						changedElement = executor.exec(rng, specificElement);
					}
					
					changedValue = setChangedElement(xmlVar, originalString, changedElement);
					System.out.println("Original element = " + specificElement.toString() + " - changed to " + changedElement.toString());
					System.out.println("Original XML string = " + originalString.toString() + " - changed to " + changedValue.toString());
					nodes.item(idx).setTextContent(changedValue.toString());
				}

				xformer = TransformerFactory.newInstance().newTransformer();
				xformer.transform(new DOMSource(doc), streamResult_o.get());
				System.out.println("Done transform for " + xmlVar.toString());
				accessor.finalise();
				System.out.println("Finalising the accessor completed: " + accessor.toString());
								
				// If changedValue is null, didn't find anything... so indicate this
				// by returning Optional
				if (changedValue == null) {
					if (THROW_EXCEPTION_ON_LOOKUP_FAILURE) {
						throw new XPathLookupFailure(xmlVar);
					}
					return Optional.empty();
				} else {
					return Optional.of(changedElement);
				}

			} catch (TransformerConfigurationException | TransformerFactoryConfigurationError e) {
				e.printStackTrace();
				throw new TransformFailed();
			} catch (TransformerException e) {
				e.printStackTrace();
				throw new TransformFailed();
			} catch (SAXException e) {
				e.printStackTrace();
				throw new TransformFailed();
			} catch (IOException e) {
				e.printStackTrace();
				throw new TransformFailed();
			} catch (ParserConfigurationException e) {
				e.printStackTrace();
				throw new TransformFailed();
			} catch (XPathExpressionException e) {
				e.printStackTrace();
				throw new TransformFailed();
			} catch (FinaliseFailed e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			// If exception, no value to return for next usage of variable
			return Optional.empty();
		}
	}

	private Object setChangedElement(XMLConfigLocation xmlVar, String originalString, Object changedElement) {
		int elementNumber = xmlVar.getElementNum();
		String sepString = xmlVar.getSeperationCharacterAsString();
		
		if (elementNumber > 0) {
			String [] elements = originalString.split(sepString);
			elements[elementNumber] = changedElement.toString();
			String result = Arrays.stream(elements).collect(Collectors.joining(sepString));
			return result;
		} else {
			return changedElement.toString();
		}
	}

	private Object extractString(XMLConfigLocation xmlVar, String originalString) {
		int elementNumber = xmlVar.getElementNum();
		String sepString = xmlVar.getSeperationCharacterAsString();
		System.out.println("Extracting element " + elementNumber + " from \"" + originalString + "\", seperator \"" + sepString + "\"");
		
		if (elementNumber > 0) {
			String [] elements = originalString.split(sepString);
			return elements[elementNumber];
		} else {
			return originalString;
		}
	}
	
	
}