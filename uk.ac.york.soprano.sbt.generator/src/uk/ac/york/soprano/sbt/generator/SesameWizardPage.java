package uk.ac.york.soprano.sbt.generator;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ResourceListSelectionDialog;

public class SesameWizardPage extends WizardPage {

	private Text testingModelLocation;
	private Text codeGenerationDirectory;
	private Composite container;
	private String defaultCodeGenerationDir;

	public SesameWizardPage() {
		super("Provide model locations");
		setTitle("Provide model locations");
	}
	
	public SesameWizardPage(String defaultCodeGenerationDir) {
		super("Provide model locations");
		setTitle("Provide model locations");
		this.defaultCodeGenerationDir = defaultCodeGenerationDir;
	}

	private boolean isWizardComplete() {
		boolean isComplete = (testingModelLocation.getText().length() > 0);
		isComplete = isComplete && (codeGenerationDirectory.getText().length() > 0);
		return isComplete; 
	}

	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NONE);

		GridLayout layout = new GridLayout();
		
		container.setLayout(layout);
		container.setBounds(0, 0, 800, 500);
		layout.numColumns = 3;
		Label label1 = new Label(container, SWT.NONE);
		label1.setText("The Testing Model:\nPlease select the SESAME Testing model");
		//label1.setText("The Testing Model:");

		testingModelLocation = new Text(container, SWT.BORDER | SWT.SINGLE);
		testingModelLocation.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
			}

			//@Override
			public void keyReleased(KeyEvent e) {
				if (isWizardComplete())
					setPageComplete(true);
				else
					setPageComplete(false);
			}

		});
		Button buttonTestingModelLocation = new Button(container, SWT.PUSH);
		buttonTestingModelLocation.setText("Browse...");
		buttonTestingModelLocation.addSelectionListener(new SelectionAdapter() {
			//@Override
			public void widgetSelected(SelectionEvent e) {
				handleBrowseFile(testingModelLocation);
				setPageComplete(isWizardComplete());
			}
		});

		//////////////////////////////////////////////////////////////////////////////////
		// Code generation directory
		Label label2 = new Label(container, SWT.NONE);
		label2.setText("Code Generation Directory:\nIf this is omitted, the base of the current project will be used");
		//label2.setText("Code Generation Directory:");
		codeGenerationDirectory = new Text(container, SWT.BORDER | SWT.SINGLE);
		codeGenerationDirectory.setText(defaultCodeGenerationDir);
		codeGenerationDirectory.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO: are all these ready
				if (isWizardComplete())
					setPageComplete(true);
				else
					setPageComplete(false);
			}
		});
		
		Button buttonCodeGenerationDir = new Button(container, SWT.PUSH);
		buttonCodeGenerationDir.setText("Browse...");
		buttonCodeGenerationDir.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				handleBrowseDirectory(codeGenerationDirectory);
				setPageComplete(isWizardComplete());
			}
		});

		setControl(container);
		setPageComplete(isWizardComplete());
	}

	public String getTestModelLocation() {
		return testingModelLocation.getText();
	}
	
	public String getCodeGenerationDirectory() {
		return codeGenerationDirectory.getText();
	}

	protected void handleBrowseFile(Text textfield) {
		ResourceListSelectionDialog dialog = new ResourceListSelectionDialog(getShell(), ResourcesPlugin.getWorkspace().getRoot(), IResource.FILE);
		if (dialog.open() == Window.OK) {
			Object[] result = dialog.getResult();
				textfield.setText(((File)result[0]).getLocation().makeAbsolute().toOSString());
				System.out.println("textfield from browseFile = " + textfield.getText());
		}
	}
	
	protected void handleBrowseDirectory(Text textfield) {
		DirectoryDialog dialog = new DirectoryDialog(getShell());
		String selectedDir = dialog.open();
		if (selectedDir != null) {
			textfield.setText(selectedDir);
		}
	}
}
