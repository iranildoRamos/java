package testes_java.lambda_express_supplier;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;

import testes_java.entidade.Pessoa;
import testes_java.entidade.PessoaRequest;

public class RunRequireNonNullElse {

	public static void main(String[] args) {
		var pessoa = new Pessoa();
		pessoa.setIdade(18);
		pessoa.setNome("Thais");
		
		var request = new PessoaRequest();
		request.setIdade(20);
		request.setNome("Iranildo");
		
		Pessoa pessoaNull = null;
		
		Supplier<String> lancadorRegraNegocio = () -> {throw new IllegalArgumentException("Pessoa não pode ser nula.");};
		
		var objeto = Objects.requireNonNull(pessoa, lancadorRegraNegocio);
		
//		var objeto2 = Objects.requireNonNullElse(Optional.ofNullable(pessoaNull), Optional.empty());
		
		var objeto2 = Objects.requireNonNullElse(Optional.ofNullable(pessoaNull), lancadorRegraNegocio);
		
		System.out.println(objeto);
		System.out.println(objeto2);
		
		Objects.requireNonNull(pessoaNull, lancadorRegraNegocio);
		

	}

}
