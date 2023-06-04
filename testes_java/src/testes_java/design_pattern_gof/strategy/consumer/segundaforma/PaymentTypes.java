package testes_java.design_pattern_gof.strategy.consumer.segundaforma;

import java.math.BigDecimal;

public class PaymentTypes {
	
	public static void money(BigDecimal amount) {
		System.out.println("Pay with Money: " + amount);
	}
	
	public static void debit(BigDecimal amount) {
		System.out.println("Pay with Debit: " + amount);
	}
	
	public static void credit(BigDecimal amount) {
		System.out.println("Pay with Credit: " + amount);
	}

}
