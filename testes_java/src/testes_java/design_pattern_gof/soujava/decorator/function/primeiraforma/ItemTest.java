package testes_java.design_pattern_gof.soujava.decorator.function.primeiraforma;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.util.function.Function;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ItemTest {

	@Test
	@DisplayName("Testando function, valor deve ser igual ao valor do produto international")
	void test() {

		Book book = new Book(BigDecimal.valueOf(10));

		Function<BigDecimal, BigDecimal> giftPacking = valor -> valor.add(BigDecimal.valueOf(10));

		assertEquals(BigDecimal.valueOf(20), giftPacking.apply(book.getValor()));

	}

	@Test
	@DisplayName("Testando function, valor deve ser igual ao valor do produto international")
	void test1() {

		Book book = new Book(BigDecimal.valueOf(10)); // 10

		Function<BigDecimal, BigDecimal> giftPacking = valor -> valor.add(BigDecimal.valueOf(15));
		giftPacking.apply(book.getValor()); // 25

		Function<BigDecimal, BigDecimal> bigTaxes = valor -> valor.add(BigDecimal.valueOf(50));
		bigTaxes.apply(book.getValor()); // 60

		assertEquals(BigDecimal.valueOf(75), giftPacking.andThen(bigTaxes).apply(book.getValor()));

	}

}
