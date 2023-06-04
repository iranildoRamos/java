package testes_java.design_pattern_gof.strategy.comstrategy;

import java.math.BigDecimal;

public class Money implements Payment {

	@Override
	public void pay(BigDecimal amount) {
		System.out.println("Pay with money " + amount);

	}

}
