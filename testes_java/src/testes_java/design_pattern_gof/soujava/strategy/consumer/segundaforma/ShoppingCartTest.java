package testes_java.design_pattern_gof.soujava.strategy.consumer.segundaforma;

import java.math.BigDecimal;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ShoppingCartTest {

	@Test
	void totalTest() {
		var item1 = Item.builder().valor(BigDecimal.TEN).build();
		var item2 = Item.builder().valor(BigDecimal.TEN).build();
		var item3 = Item.builder().valor(BigDecimal.TEN).build();
		
		var itens = Arrays.asList(item1, item2, item3);
		
		var cart = ShoppingCart.builder().itens(itens).build();
		
		cart.pay( PaymentTypes::money );
		cart.pay( PaymentTypes::credit );
		cart.pay( PaymentTypes::debit );
		
	}
	
}
