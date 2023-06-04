package testes_java.design_pattern_gof.soujava.templatemethod.comtemplatemethod;

public interface Operation {
	
	default void process(Operation op) {
		System.out.println("Processing...");
	}

}
