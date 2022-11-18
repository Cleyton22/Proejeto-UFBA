public class Editora {
	private String idEditora;
	private String nome;
	private String endereco;
	private String bairro;
	private String cidade;
	private String uf;
	
	// construtores
	public Editora() {
		this.idEditora = null;
		this.nome = null;
		this.endereco = null;
		this.bairro = null;
		this.cidade = null;
		this.uf = null;
	}
	
	public Editora(String idEditora, String nome, String endereco, String bairro, String cidade, String uf) {
		this.idEditora = idEditora;
		this.nome = nome;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
	}
	
	// métodos de encapsulamento
	public String getIdEditora() {
		return this.idEditora;
	}
	
	public void setIdEditora(String idEditora) {
		this.idEditora = idEditora;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getBairro() {
		return this.bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getCidade() {
		return this.cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getUf() {
		return this.uf;
	}
	
	public void setUf(String uf) {
		this.uf = uf;
	}
}
