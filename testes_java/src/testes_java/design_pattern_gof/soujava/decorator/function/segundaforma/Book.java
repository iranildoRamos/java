package testes_java.design_pattern_gof.soujava.decorator.function.segundaforma;

import java.math.BigDecimal;
import java.util.function.Function;

import lombok.Builder;

/*
 * Problema: O valor pode variar:
 * 1° - Caso tenha frete
 * 2° - Taxa de envio pelo Sedex
 * 3° - Outros impostos...
 * 
 * Como resolver isso, sem dar muita responsabilidade
 * ao getter do valor?
 * */
@Builder
public class Book {

	private BigDecimal valor;

	private Function<BigDecimal, BigDecimal>[] itemExtras = new Function[] {};

	public BigDecimal getValor() {
		BigDecimal valorComExtras = valor;

		for (Function<BigDecimal, BigDecimal> itemExtra : itemExtras) {
			valorComExtras = itemExtra.apply(valorComExtras);
		}

		return valorComExtras;
	}

	public Function<BigDecimal, BigDecimal>[] getItemExtras() {
		return itemExtras;
	}

	public void setItemExtras( Function<BigDecimal, BigDecimal>... itemExtras ) {
		this.itemExtras = itemExtras;
	}

	public Book(BigDecimal valor) {
		this.valor = valor;
	}

	public Book(BigDecimal valor, Function<BigDecimal, BigDecimal>[] itemExtras) {
		this.valor = valor;
		this.itemExtras = itemExtras;
	}
}
