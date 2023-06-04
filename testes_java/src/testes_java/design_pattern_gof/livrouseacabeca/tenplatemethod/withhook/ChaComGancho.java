package testes_java.design_pattern_gof.livrouseacabeca.tenplatemethod.withhook;

public class ChaComGancho implements CafeinaBebidaComGancho {

	@Override
	public void fazerInfusao() {
		System.out.println("Macerando o chá");

	}

	@Override
	public void adicionarCondimentos() {
		System.out.println("Adicionando açucar e leite");

	}
}
