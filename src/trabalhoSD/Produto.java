package trabalhoSD;

public class Produto {
	private String nome;
	private int id;
	private int quantidade;
	
	public Produto (String nome, int id, int qntd) {
		this.id = id;
		this.nome = nome;
		this.quantidade = qntd;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
