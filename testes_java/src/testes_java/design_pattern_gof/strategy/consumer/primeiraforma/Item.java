package testes_java.design_pattern_gof.strategy.consumer.primeiraforma;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Item {

	private BigDecimal valor;
}
