package testes_java.design_pattern_gof.soujava.decorator.function.terceiraforma;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ItemTest {

	@Test
	@DisplayName("Testando function, valor deve ser igual ao valor do produto")
	void test1() {

		Book book = new Book(BigDecimal.valueOf(10), Packing::giftPacking, Taxes::international);

		assertEquals(BigDecimal.valueOf(75), book.getValor());

	}

}
