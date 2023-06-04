package testes_java.design_pattern_gof.decorator.function.terceiraforma;

import java.math.BigDecimal;

public class Packing {
	
	public static BigDecimal giftPacking(BigDecimal valor) {
		return valor.add(BigDecimal.valueOf(15));
	}
}
