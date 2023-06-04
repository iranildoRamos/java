package testes_java.entidade;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class Entidade implements Objeto {

	private String nome;
	
	private Integer idade;
	
	private List<BigDecimal> valores;

	private List<Carro> listaCarro;

	public List<Carro> getListaCarro() {
		return listaCarro;
	}

	public void setListaCarro(List<Carro> listaCarro) {
		this.listaCarro = listaCarro;
	}

	public List<BigDecimal> getValores() {
		return valores;
	}

	public void setValores(List<BigDecimal> valores) {
		this.valores = valores;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	/* AGRUPA PROPRIETARIOS POR CARROS */
	public Map<Objeto, Set<String>> getCarroPorGrupoDeProprietario() {

		return listaCarro.stream().collect(
				Collectors.groupingBy(Carro::getProprietario, Collectors.mapping(Carro::getMarca, Collectors.toSet())));
	}
	
	
	
}
