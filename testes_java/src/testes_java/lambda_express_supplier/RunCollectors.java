package testes_java.lambda_express_supplier;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import testes_java.entidade.Carro;
import testes_java.entidade.Entidade;
import testes_java.entidade.Proprietario;

public class RunCollectors {

	@Test
	@DisplayName("Testando Collectors")
	public void test() {
		Entidade proprietario1 = new Proprietario();
		proprietario1.setIdade(3);
		proprietario1.setNome("MIROSVALDO");
		proprietario1.setValores(List.of(BigDecimal.ZERO, BigDecimal.ONE, BigDecimal.TEN, BigDecimal.valueOf(200.00)));

		Entidade proprietario2 = new Proprietario();
		proprietario2.setIdade(34);
		proprietario2.setNome("MIROSVANIA");
		
		Carro carro1 = new Carro();
		carro1.setId(1L);
		carro1.setMarca("GOL");
		carro1.setProprietario(proprietario1);
		
		Carro carro2 = new Carro();
		carro2.setId(1L);
		carro2.setMarca("TESLA");
		carro2.setProprietario(proprietario1);
		
		Carro carro3 = new Carro();
		carro3.setId(1L);
		carro3.setMarca("WOLKSWAGNER");
		carro3.setProprietario(proprietario2);
		proprietario1.setListaCarro(Arrays.asList(carro1, carro2, carro3));
		
		var lst = toList(proprietario1.getValores().stream());
		
		System.err.println(lst);
		
		System.err.println(proprietario1.getCarroPorGrupoDeProprietario());

	}

	public List<BigDecimal> toList(Stream<BigDecimal> lista) {
		return lista.filter(Objects::nonNull).collect(Collectors.toCollection(ArrayList::new));
	}

}
