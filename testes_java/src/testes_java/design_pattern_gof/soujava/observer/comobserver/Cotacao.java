package testes_java.design_pattern_gof.soujava.observer.comobserver;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cotacao {
	
	private String moeda;
	
	private BigDecimal valor;

}
