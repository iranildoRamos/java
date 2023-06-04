package testes_java.design_pattern_gof.soujava.observer.comobserver;

import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CotacaoTest {

	@Test
	@DisplayName("Testando observers")
	void test() {
		Banco banco = new Banco();
		Investidor investidor = new Investidor();
		
		ServidorCotacao servidorCotacao = new ServidorCotacao();

		servidorCotacao.registerObserver(banco);
		servidorCotacao.registerObserver(investidor);

		Assertions.assertDoesNotThrow(() -> servidorCotacao.novaCotacao(new Cotacao("USD", BigDecimal.valueOf(10))));
	}

}
