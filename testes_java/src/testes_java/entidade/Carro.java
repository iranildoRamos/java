package testes_java.entidade;

public class Carro {

	private Long id;

	private String marca;
	
	private Objeto proprietario;

	public Objeto getProprietario() {
		return proprietario;
	}

	public void setProprietario(Objeto proprietario) {
		this.proprietario = proprietario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
