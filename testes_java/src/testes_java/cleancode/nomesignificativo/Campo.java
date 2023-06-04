package testes_java.cleancode.nomesignificativo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Campo {

	private static final int POSICAO_INICIAL = 0;

	private static final int MARCADO_COM_BANDEIRINHA = 4;

	private List<int[]> jogoDeTabuleiro = new ArrayList<>();

	public List<int[]> getJogoDeTabuleiro() {
		return jogoDeTabuleiro;
	}

	public void setJogoDeTabuleiro(List<int[]> jogoDeTabuleiro) {
		this.jogoDeTabuleiro = jogoDeTabuleiro;
	}

	@Override
	public String toString() {
		return "Campo [jogoDeTabuleiro=" + jogoDeTabuleiro + "]";
	}

	public List<Campo> jogoDeTabuleiro() {
		int[] c = { 1, 2, 3, 4 };
		List<int[]> campos = Arrays.asList(c);
		
		setJogoDeTabuleiro(campos);

		var camposComBandeirinhas = new ArrayList<Campo>();
		camposComBandeirinhas.add(this);

		return camposComBandeirinhas;
	}

	public boolean estaMarcadoComBandeirinha() {
		for (int[] campo : getJogoDeTabuleiro()) {
			if (campo[POSICAO_INICIAL] == MARCADO_COM_BANDEIRINHA) {
				return true;
			}
		}
		return false;
	}
}
