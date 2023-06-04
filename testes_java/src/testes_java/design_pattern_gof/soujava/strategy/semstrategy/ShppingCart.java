package testes_java.design_pattern_gof.soujava.strategy.semstrategy;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;

@Data
public class ShppingCart {

	private List<Item> itens;

	/*
	 * Os problemas:
	 * 
	 * 1° - Para cada tipo de método de pagamento eu tenho que incluir mais um 'if'.
	 * 2° - O método de pagamento deveria só pagar e não selecionar o tipo de
	 * pagamento.
	 * 3° - Fere o princípio de SRP(SOLID)
	 */
	public void pay(PaymentMethod method) {
		var total = cartTotal();

		if (method == PaymentMethod.CREDIT) {
			System.out.println("Pay with credit " + total);
		} else if (method == PaymentMethod.MONEY) {
			System.out.println("Pay with money " + total);
		}
	}

	private BigDecimal cartTotal() {
		return itens.stream().map(Item::getValor).reduce(BigDecimal.ZERO, BigDecimal::add);
	}

}
