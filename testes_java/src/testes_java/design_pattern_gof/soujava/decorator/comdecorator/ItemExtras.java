package testes_java.design_pattern_gof.soujava.decorator.comdecorator;

import java.math.BigDecimal;

public abstract class ItemExtras implements Item {

	private Item item;
	
	ItemExtras(Item item) {
		this.item = item;
	}
	
	@Override
	public BigDecimal getValor() {
		return item.getValor();
	}

}
