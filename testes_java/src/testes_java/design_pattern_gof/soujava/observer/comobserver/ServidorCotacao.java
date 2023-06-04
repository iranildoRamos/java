package testes_java.design_pattern_gof.soujava.observer.comobserver;

import java.util.ArrayList;
import java.util.List;

public class ServidorCotacao implements Subject {
	
	private List<Observer> observers = new ArrayList<Observer>();
	
	public void novaCotacao( Cotacao cotacao ) {
		notifyObservers( cotacao );
	}
	
	private void notifyObservers( Cotacao cotacao ) {
		observers.forEach( o -> o.notify(cotacao) );
		
	}

	@Override
	public void registerObserver( Observer observer ) {
		observers.add( observer );

	}

}
