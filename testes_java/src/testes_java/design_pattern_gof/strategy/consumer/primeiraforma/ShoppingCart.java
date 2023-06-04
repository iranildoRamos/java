package testes_java.design_pattern_gof.strategy.consumer.primeiraforma;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Consumer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ShoppingCart {

	private List<Item> itens;

	/*
	 * A solução: Seguindo usando interface funcional: Consulmer.
	 * 
	 * 1° - Substituímos a interface Payment pela interface Consumer(Java)
	 * 2° - Substituímos o método 'pay' pelo 'accept'
	 * 
	 */
	public void pay(Consumer<BigDecimal> method) {
		var total = cartTotal();
		method.accept(total);

	}

	private BigDecimal cartTotal() {
		return itens.stream().map(Item::getValor).reduce(BigDecimal.ZERO, BigDecimal::add);
	}

}
