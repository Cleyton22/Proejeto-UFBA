public class Livro {
	private int idLivro;
	private String nomeLivro;
	private String autor;
	private boolean status;
	private Editora editora;
	
	// construtores
	public Livro() {
		this.idLivro = -1;
		this.nomeLivro = null;
		this.autor = null;
		this.editora = null;
		this.status = true;
	}

	public Livro(int idLivro, String nomeLivro, String autor, Editora editora, boolean status) {
		this.idLivro = idLivro;
		this.nomeLivro = nomeLivro;
		this.autor = autor;
		this.editora = editora;
		this.status= status;
	}
	
	// métodos de encapsulamento
	public boolean getStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public int getIdLivro() {
		return idLivro;
	}
	
	public void setIdLivro(int idLivro) {
		this.idLivro = idLivro;
	}
	
	public String getNomeLivro() {
		return nomeLivro;
	}
	
	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public Editora getEditora() {
		return editora;
	}
	
	public void setEditora(Editora editora) {
		this.editora = editora;
	}
}
