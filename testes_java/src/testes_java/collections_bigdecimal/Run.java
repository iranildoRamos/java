package testes_java.collections_bigdecimal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import testes_java.entidade.PessoaRequest;

public class Run {

	public static void main(String[] args) {
		var request = new PessoaRequest();
		request.setIdade(20);
		request.setNome("Iranildo");
		request.setValores(List.of(new BigDecimal("99999999999999999999999999999.99"), BigDecimal.TEN));

		var valores = request.getValores();

		System.out.println("lista: " + valores);
		System.out.println("menor valor da lista: " + Collections.min(valores));
		System.out.println("maior valor da lista: " + Collections.max(valores));

		var lstMutable = new ArrayList<>(valores);
		Collections.sort(lstMutable);
		System.out.println("lista modificada ordenada: " + lstMutable);

		Collections.reverse(lstMutable);
		System.out.println("lista modificada reordenada: " + lstMutable);
	}
}
