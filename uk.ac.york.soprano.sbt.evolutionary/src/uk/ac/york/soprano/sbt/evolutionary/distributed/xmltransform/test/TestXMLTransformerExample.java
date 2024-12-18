package uk.ac.york.soprano.sbt.evolutionary.distributed.xmltransform.test;

import java.io.File;
import java.io.IOException;
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

public class TestXMLTransformerExample {

	public static final String inputFilePath = "/home/jharbin/academic/pal/xml_test_files/pal_kitchen.world";
	public static final String outputFilePath = "/home/jharbin/academic/pal/xml_test_files/pal_kitchen_changed.world";
	
	public final static String xpath_expr_str = "/sdf/world/physics/max_step_size";
	public final static Double changedValue = 0.002;
	

	public static void main(String[] args) throws IOException, InterruptedException {
		Transformer xformer;
		try {
			Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(inputFilePath));
			XPath xpath = XPathFactory.newInstance().newXPath();
			// Select the current value
			NodeList nodes = (NodeList)xpath.evaluate(xpath_expr_str, doc,XPathConstants.NODESET);

			// replace all nodes matching with new value
			for (int idx = 0; idx < nodes.getLength(); idx++) {
				nodes.item(idx).setTextContent(changedValue.toString());
			}

			xformer = TransformerFactory.newInstance().newTransformer();
			xformer.transform(new DOMSource(doc), new StreamResult(new File(outputFilePath)));
			System.out.println("Done! - written to " + outputFilePath);
			
		} catch (TransformerConfigurationException | TransformerFactoryConfigurationError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}