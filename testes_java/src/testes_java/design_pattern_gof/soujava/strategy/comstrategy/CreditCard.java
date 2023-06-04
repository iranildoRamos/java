package testes_java.design_pattern_gof.soujava.strategy.comstrategy;

import java.math.BigDecimal;

public class CreditCard implements Payment {

	@Override
	public void pay(BigDecimal amount) {
		System.out.println("Pay with credit " + amount);

	}

}
