package testes_java.design_pattern_gof.decorator.comdecorator;

import java.math.BigDecimal;

public class GiftPacking extends ItemExtras {

	/*
	 * O item que estou recebendo no meu construtor 
	 * estou acrescentando 15 ao seu valor
	 */
	GiftPacking(Item item) {
		super(item);
	}

	@Override
	public BigDecimal getValor() {
		return BigDecimal.valueOf(15).add(super.getValor());
	}

}
