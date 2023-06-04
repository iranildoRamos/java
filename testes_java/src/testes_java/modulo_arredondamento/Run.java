package testes_java.modulo_arredondamento;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import org.junit.jupiter.api.Test;

import testes_java.entidade.PessoaRequest;

public class Run {

	@Test
	void test1() {
		
		var request = new PessoaRequest();
		request.setIdade(20);
		request.setNome("Iranildo");
		request.setValores(List.of(new BigDecimal("4.6566")));

		var valores = request.getValores();
		
		var totalArredondadoPraCima = valores.stream().reduce(BigDecimal.ZERO, BigDecimal::add);
	
		System.out.println("Valor 0 casas décimais : " + totalArredondadoPraCima.setScale(0, RoundingMode.CEILING));
		System.out.println("Valor 1 casas décimais : " + totalArredondadoPraCima.setScale(1, RoundingMode.DOWN));
		System.out.println("Valor 2 casas décimais : " + totalArredondadoPraCima.setScale(2, RoundingMode.HALF_EVEN));
		System.out.println("Valor 2 casas décimais sem arredondamento: " + totalArredondadoPraCima.setScale(2, RoundingMode.FLOOR));
		System.out.println("Valor 3 casas décimais : " + totalArredondadoPraCima.setScale(3, RoundingMode.HALF_UP));
	}

}
