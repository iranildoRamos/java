package testes_java.entidade;

import java.math.BigDecimal;

public interface Objeto {

	default boolean todosValoresSaoMaiorQueZero(Entidade entidade) {
		return entidade.getValores().stream().allMatch(v -> v.compareTo(BigDecimal.ZERO) > 0);
	}

}
