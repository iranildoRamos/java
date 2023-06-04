package testes_java.lambda_express_supplier;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import testes_java.entidade.Entidade;
import testes_java.entidade.Pessoa;

public class RunCompareTo {

	@Test
	@DisplayName("deve remover BigDecimal.ZERO")
	void test() {
		
		Entidade e1 = new Pessoa();
		e1.setIdade(1);
		e1.setNome("Jão");
		e1.setValores(List.of(BigDecimal.ONE, BigDecimal.TEN, BigDecimal.valueOf(100.00)));

		Entidade e2 = new Pessoa();
		e2.setIdade(2);
		e2.setNome("Jão");
		e2.setValores(List.of(BigDecimal.ZERO, BigDecimal.ONE, BigDecimal.TEN, BigDecimal.valueOf(200.00)));

		Entidade esperado = new Pessoa();
		esperado.setIdade(2);
		esperado.setNome("Jão");
		esperado.setValores(List.of(BigDecimal.ONE, BigDecimal.TEN, BigDecimal.valueOf(200.00)));
		
		var allHasvalorMaiorQueZero = e2.todosValoresSaoMaiorQueZero(esperado);
		
		assertTrue(allHasvalorMaiorQueZero);
	}
	
}
