package testes_java.design_pattern_gof.soujava.observer.comobserver;

public class Investidor implements Observer {

	@Override
	public void notify(Cotacao lance) {
		System.out.println("Investidor: " + lance);

	}

}
