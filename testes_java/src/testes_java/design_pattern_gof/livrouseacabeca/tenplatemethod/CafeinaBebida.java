package testes_java.design_pattern_gof.livrouseacabeca.tenplatemethod;

public abstract class CafeinaBebida {
	
	final void prepararReceita() {
		ferverAgua();
		fazerInfusao();
		despejarNoCopo();
		adicionarCondimentos();
		gancho();
	}

	abstract void fazerInfusao();
	
	abstract void adicionarCondimentos();
	
	void gancho() {}
	
	void ferverAgua() {
		System.out.println("Ferverndo água.");
	}
	
	void despejarNoCopo() {
		System.out.println("Despejando no copo.");
	}
	
}
