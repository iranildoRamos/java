package testes_java.design_pattern_gof.livrouseacabeca.tenplatemethod;

public class Cafe extends CafeinaBebida{

	@Override
	void fazerInfusao() {
		System.out.println("Coando café");
		
	}

	@Override
	void adicionarCondimentos() {
		System.out.println("Adicionando açucar e leite");
		
	}

}
