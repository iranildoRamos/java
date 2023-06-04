package testes_java.design_pattern_gof.decorator.function.segundaforma;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.util.function.Function;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ItemTest {

	@Test
	@DisplayName("Testando function, valor deve ser igual ao valor do produto")
	void test1() {

		Book book = new Book(BigDecimal.valueOf(10)); // 10

		Function<BigDecimal, BigDecimal> giftPacking = valor -> valor.add(BigDecimal.valueOf(15));// 25

		Function<BigDecimal, BigDecimal> bigTaxes = valor -> valor.add(BigDecimal.valueOf(50));// 60

		book.setItemExtras(giftPacking, bigTaxes);
		
		assertEquals(BigDecimal.valueOf(75), book.getValor());

	}

}
