package testes_java.design_pattern_gof.livreouseacabeca.tenplatemethod;

public class Cha extends CafeinaBebida{

	@Override
	void fazerInfusao() {
		System.out.println("Macerando o chá");
		
	}

	@Override
	void adicionarCondimentos() {
		System.out.println("Adicionando açucar e leite");
		
	}
}
