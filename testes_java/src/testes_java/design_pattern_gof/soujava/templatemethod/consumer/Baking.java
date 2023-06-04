package testes_java.design_pattern_gof.soujava.templatemethod.consumer;

import java.util.function.Consumer;

import testes_java.design_pattern_gof.soujava.templatemethod.comtemplatemethod.Operation;

//Foi convertida de abstract para class concreta
public class Baking {

	public void processOperation(Operation op) {
		process(op);
	}

	// Passagem da interface funcional Consumer como parâmetros
	// Dessa forma não preciso criar uma hierarquia de tipos (class que estende
	// abstract, implementa interface e etc..)
	public void processOperation(Operation op, Consumer<Operation> preProcessing, Consumer<Operation> postProcessing) {

		preProcessing.accept(op);
		process(op);
		postProcessing.accept(op);

	}

	private void process(Operation op) {
		op.process(op);
	}

}
