package testes_java.design_pattern_gof.livreouseacabeca.tenplatemethod;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/*
 * Definindo o padrão Template Method:
 * Defini o esqueleto de um algoritmo
 * dentro de um método, tranferindo alguns
 * de seus passos para as subsclasses.
 * O Template Method permite que
 * as subsclasses redefinam certos passos
 * de um algoritmo sem alterar a estrutura
 * do próprio algoritmo.
 * */
public class TemplateMethodTest {

	@Test
	@DisplayName("Deve fazer chá")
	void teste1() {
		Cha cha = new Cha();
		cha.prepararReceita();
	}
	
	@Test
	@DisplayName("Deve fazer café")
	void teste2() {
		Cafe cafe = new Cafe();
		cafe.prepararReceita();
	}
	
}
