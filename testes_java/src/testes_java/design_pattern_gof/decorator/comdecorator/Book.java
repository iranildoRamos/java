package testes_java.design_pattern_gof.decorator.comdecorator;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

/*
 * Problema: O valor pode variar:
 * 1° - Caso tenha frete
 * 2° - Taxa de envio pelo Sedex
 * 3° - Outros impostos...
 * 
 * Como resolver isso, sem dar muita responsabilidade
 * ao getter do valor?
 * */
@Data
@Builder
public class Book implements Item{

	private BigDecimal valor;
}
