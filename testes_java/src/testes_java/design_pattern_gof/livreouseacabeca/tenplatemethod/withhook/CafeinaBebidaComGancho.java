package testes_java.design_pattern_gof.livreouseacabeca.tenplatemethod.withhook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public interface CafeinaBebidaComGancho {

	default void prepararReceita() {
		ferverAgua();
		fazerInfusao();
		despejarNoCopo();
		
		if (clienteQuerCondimentos()) {
			adicionarCondimentos();
		}
	}

	abstract void fazerInfusao();

	abstract void adicionarCondimentos();

	default void ferverAgua() {
		System.out.println("Ferverndo água.");
	}

	default void despejarNoCopo() {
		System.out.println("Despejando no copo.");
	}

	default boolean clienteQuerCondimentos() {
		
		String responder = getEntrada();
		
		return responder.toLowerCase().startsWith("s");
		
	}

	private String getEntrada() {
		String responder = null;

		System.out.println("Você gostaria de leite e açúcar (s/n)?");
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		try {
			responder = entrada.readLine();
		} catch (IOException ioe) {
			System.err.println("Erro ao tentar lêr sua resposta");
		}

		return Objects.isNull(responder) ? "Não" : responder;

	}

}
