package testes_java.design_pattern_gof.strategy.comstrategy;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;
import testes_java.design_pattern_gof.strategy.semstrategy.Item;

@Data
public class ShppingCart {

	private List<Item> itens;

	/*
	 * A solução: Seguindo os princípios de SRP e OCP(SOLID) e aplicando Design
	 * Parttern STRATEGY.
	 * 
	 * 1° - Substituímos o Enum PaymentMethod pela interface Payment 
	 * 2° - Removemos os 'if's' e invocamos o método pay pela interface
	 */
	public void pay(Payment method) {
		var total = cartTotal();
		method.pay(total);

	}

	private BigDecimal cartTotal() {
		return itens.stream().map(Item::getValor).reduce(BigDecimal.ZERO, BigDecimal::add);
	}

}
