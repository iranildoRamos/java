package testes_java.design_pattern_gof.soujava.decorator.comdecorator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ItemTest {

	@Test
	@DisplayName("Testando decorator, valor deve ser igual ao valor do produto international")
	void test() {

		Item book = new Book(BigDecimal.valueOf(10));
		book.getValor();

		Item international = new InternationalDelivery(book);

		assertEquals(BigDecimal.valueOf(20), international.getValor());

	}

	@Test
	@DisplayName("Testando decorator, valor deve ser igual ao valor do produto international")
	void test1() {
		
		//10
		Item book = new Book(BigDecimal.valueOf(10));
		book.getValor();
		
		//resultado: 10(Book) + 20(International) + 15(GiftPacking)
		Item international = new GiftPacking(new InternationalDelivery(book));
		
		//resultado= 35
		assertEquals(BigDecimal.valueOf(35), international.getValor());

	}

}
