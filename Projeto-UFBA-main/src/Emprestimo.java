import java.sql.Date;

public class Emprestimo {
	private int idEmprestimo;
	private String dataEmprestimo;
	private String prazoEntrega;
	private Usuario usuario;
	private Livro livro;
	private String nomeLivro;
	private String nomeUsuario;
	
	// construtores
	public Emprestimo() {
		this.dataEmprestimo = null;
		this.prazoEntrega = null;
		this.usuario = null;
		this.livro = null;
	}
	
	public Emprestimo(String dataEmprestimo, String prazoEntrega, Usuario usuario, Livro livro) {
		this.dataEmprestimo = dataEmprestimo;
		this.prazoEntrega = prazoEntrega;
		this.usuario = usuario;
		this.livro = livro;
	}
	
	// métodos de encapsulamento
	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsurio) {
		this.nomeUsuario = nomeUsurio;
	}

	public int getIdEmprestimo() {
		return idEmprestimo;
	}
	
	public void setIdEmprestimo(int idEmprestimo) {
		this.idEmprestimo = idEmprestimo;
	}
	
	public String getDataEmpretismo() {
		return dataEmprestimo;
	}
	
	public void setDataEmpretismo(String dataEmpretismo) {
		this.dataEmprestimo = dataEmpretismo;
	}
	
	public String getPrazoEntrega() {
		return prazoEntrega;
	}
	
	public void setPrazoEntrega(String prazoEntrega) {
		this.prazoEntrega = prazoEntrega;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Livro getLivro() {
		return livro;
	}
	
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
}
