package testes_java.design_pattern_gof.decorator.function.terceiraforma;

import java.math.BigDecimal;
import java.util.function.Function;
import java.util.stream.Stream;

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

	//O 'for' foi refatorado,
	public BigDecimal getValor() {
		BigDecimal valorComExtras = valor;

		Function<BigDecimal, BigDecimal> itemExtra = Stream.of(itemExtras).reduce(Function.identity(),
				Function::andThen);

		return itemExtra.apply(valorComExtras);
	}

	public Function<BigDecimal, BigDecimal>[] getItemExtras() {
		return itemExtras;
	}

	public void setItemExtras(Function<BigDecimal, BigDecimal>... itemExtras) {
		this.itemExtras = itemExtras;
	}

	public Book(BigDecimal valor) {
		this.valor = valor;
	}

	public Book(BigDecimal valor, Function<BigDecimal, BigDecimal>... itemExtras) {
		this.valor = valor;
		this.itemExtras = itemExtras;
	}
}
