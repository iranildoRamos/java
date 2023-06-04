package testes_java.design_pattern_gof.soujava.observer.consumer;

import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import testes_java.design_pattern_gof.soujava.observer.comobserver.Cotacao;
import testes_java.design_pattern_gof.soujava.observer.comobserver.ServidorCotacao;

public class CotacaoTest {
	
	/*
	 * Não precisou mudar os arquivos no pacote comobserver
	 * porque o observer é um consumer, porque eu recebo o objeto
	 * e retorno void
	 * */
	@Test
	@DisplayName("Testando observers")
	void test() {
		ServidorCotacao servidorCotacao = new ServidorCotacao();

		servidorCotacao.registerObserver(cotacao -> System.out.println("Banco: " + cotacao));
		servidorCotacao.registerObserver(cotacao -> {
			System.out.println("Investidor: " + cotacao);
		});

		Assertions.assertDoesNotThrow(() -> servidorCotacao.novaCotacao(new Cotacao("USD", BigDecimal.valueOf(10))));
	}

}
