package testes_java.collections_bigdecimal;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.Scanner;

public class RunVerificarValorDisponivelESalvar {

	public static void main(String[] args) {

		System.out.println(">Digite o valor total mensal do contrato(Ocorrerá através de um find do Contrato): ");
		Scanner entrada = new Scanner(System.in);
		var valorTotalMensalCronogramaDesembolso = entrada.nextBigDecimal();

		// TODO: Obtenção da informação ocorrerá através de um find em Alocação de
		// recursos
		var valorMensalExistenteAlocadoEmMAPPDiferente = new BigDecimal("9.00");

		System.out.println(">Digite o novo valor mensal a ser alocado: ");
		var valorMensalNovoAserAlocadoEmMAPPDiferente = entrada.nextBigDecimal();

		var valorRestanteAntigo = subtrairSeDiferenteDeNulo(valorTotalMensalCronogramaDesembolso,
				valorMensalExistenteAlocadoEmMAPPDiferente);
		var valorRestanteNovo = subtrairSeDiferenteDeNulo(valorRestanteAntigo,
				valorMensalNovoAserAlocadoEmMAPPDiferente);

		if (Objects.nonNull(valorRestanteNovo) && (isNegativo(valorRestanteNovo))) {
			throw new IllegalArgumentException("Valor indisponível para alocação");
		}

		if (Objects.isNull(valorRestanteNovo) && Objects.nonNull(valorMensalNovoAserAlocadoEmMAPPDiferente)) {

			var resultado = valorTotalMensalCronogramaDesembolso.subtract(valorMensalNovoAserAlocadoEmMAPPDiferente);

			if (isNegativo(resultado))
				throw new IllegalArgumentException("Valor indisponível para alocação");
		}

		System.out.println(
				">>>>>>>>>>>>>>>>Salvar o valor de entrada no banco:" + valorMensalNovoAserAlocadoEmMAPPDiferente);

	}

	private static BigDecimal subtrairSeDiferenteDeNulo(BigDecimal valorTotalMensalCronogramaDesembolso,
			BigDecimal valorMensalAlocadoEmMAPPDiferente) {
		return !estaoNulos(valorTotalMensalCronogramaDesembolso, valorMensalAlocadoEmMAPPDiferente)
				? valorTotalMensalCronogramaDesembolso.subtract(valorMensalAlocadoEmMAPPDiferente)
				: null;
	}

	private static boolean estaoNulos(BigDecimal valor1, BigDecimal valor2) {
		return Objects.isNull(valor1) || Objects.isNull(valor2);
	}

	public static boolean isNegativo(BigDecimal valor) {
		return valor.compareTo(BigDecimal.ZERO) < 0;
	}

}
