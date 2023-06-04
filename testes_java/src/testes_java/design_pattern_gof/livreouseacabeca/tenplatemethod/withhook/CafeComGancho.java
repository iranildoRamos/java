package testes_java.design_pattern_gof.livreouseacabeca.tenplatemethod.withhook;

public class CafeComGancho implements CafeinaBebidaComGancho{

	@Override
	public void fazerInfusao() {
		System.out.println("Coando café");
		
	}

	@Override
	public void adicionarCondimentos() {
		System.out.println("Adicionando açucar e leite");
		
	}

}
