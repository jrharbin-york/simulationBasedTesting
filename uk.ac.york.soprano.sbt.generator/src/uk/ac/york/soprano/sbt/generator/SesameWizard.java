package uk.ac.york.soprano.sbt.generator;

import org.eclipse.jface.wizard.Wizard;

public class SesameWizard extends Wizard {

	protected SesameWizardPage page;
	private UpdateProjectHandlerExecutor wizardExecutor;

	public SesameWizard(UpdateProjectHandlerExecutor updateProjectHandlerExecutor) {
		super();
		this.wizardExecutor = updateProjectHandlerExecutor;
		setNeedsProgressMonitor(true);
	}

	@Override
	public String getWindowTitle() {
		return "Provide Test and MRS Models";
	}

	@Override
	public void addPages() {
		// JRH: supply the default code generation directory from the IProjectPath
		page = new SesameWizardPage(wizardExecutor.getIProjectPath());
		addPage(page);
	}

	@Override
	public boolean performFinish() {
        wizardExecutor.setTestingModelPath(page.getTestModelLocation());
        wizardExecutor.setCodeGenerationDirectory(page.getCodeGenerationDirectory());
		return true;
	}
}
