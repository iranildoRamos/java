package testes_java.design_pattern_gof.soujava.templatemethod.comtemplatemethod;

public abstract class Baking {

	public void processOperation( Operation op ) {
		postProcessing(op);
		process(op);
		preProcessing(op);
	}
	
	protected abstract void postProcessing( Operation op );
	
	protected abstract void preProcessing( Operation op );
	
	private void process( Operation op ) {
		op.process( op );
	}
	
}
