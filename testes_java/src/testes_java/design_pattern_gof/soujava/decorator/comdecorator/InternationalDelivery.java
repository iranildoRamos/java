package testes_java.design_pattern_gof.soujava.decorator.comdecorator;

import java.math.BigDecimal;

public class InternationalDelivery extends ItemExtras {
	
	/*
	 * O item que estou recebendo no meu construtor
	 * estou acrescentando 10 ao seu valor
	 * */
	InternationalDelivery(Item item) {
		super(item);
	}

	@Override
	public BigDecimal getValor() {
		return BigDecimal.TEN.add(super.getValor());
	}

}
