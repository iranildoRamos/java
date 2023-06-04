package testes_java.cleancode.nomesignificativo;

import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CodigoComNomeSignificativo {

	// TODO: DEPOIS
	public List<Campo> obterCamposMarcadosComBandeirinha() {
		Campo campo = new Campo();

		var camposComBandeirinhas = new ArrayList<Campo>();
		for (Campo camp : campo.jogoDeTabuleiro()) {
			if (camp.estaMarcadoComBandeirinha())
				camposComBandeirinhas.add(camp);
		}
		return camposComBandeirinhas;
	}

	@Test
	@DisplayName("Deve retornar falso, pois o elemento na posição zero tem valor igual a 1")
	void test() {
		obterCamposMarcadosComBandeirinha().forEach(System.out::print);
		assertFalse(!obterCamposMarcadosComBandeirinha().isEmpty());
	}

}
