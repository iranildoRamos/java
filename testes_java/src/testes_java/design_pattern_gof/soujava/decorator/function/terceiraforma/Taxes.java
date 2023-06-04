package testes_java.design_pattern_gof.soujava.decorator.function.terceiraforma;

import java.math.BigDecimal;

public class Taxes {

	public static BigDecimal international(BigDecimal valor) {
		return valor.add(BigDecimal.valueOf(50));
	}
}
