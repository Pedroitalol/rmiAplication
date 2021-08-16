package trabalhoSD;

import java.util.ArrayList;

public class Loja {
	private ArrayList<Produto> produtos;
	private int max;
	private int horarios[] = new int[10];
	
	public Loja(int max) {
		this.max = max;
		produtos = new ArrayList<Produto>();
		for(int i = 0; i <= 9; i++) this.horarios[i] = 10;
	}
	
	// Add um livro:
	public void addLivro(Produto p) {
		if(produtos.size() <= max) {
			this.produtos.add(p);
		}else {
			System.out.println("Lista de produtos cheia.");
		}
	}

	public String acharProduto(String nome){
		for (Produto i:this.produtos) {
			if(i.getNome().equals(nome) && i.getQuantidade() > 0){
				if(i.getQuantidade() > 1){
					return "Produto achado com sucesso, temos " + i.getQuantidade() +" exemplares desse " +
							"produto";
				}else{
					return "Produto achado com sucesso, temos " + i.getQuantidade() +" exemplar desse " +
							"produto";
				}

			}
		}
		return "Produto não encontrado";
	}

	// Remove um livro pelo id:
	public void removerLivro(int id) {
		boolean flag = false;
		for (int i = 0; i < this.produtos.size(); i++) {
			if(this.produtos.get(i).getId() == id) {
				this.produtos.remove(i);
				flag = true;
			}
		}
		if(flag) System.out.println("Item removido com sucesso.");
		else System.out.println("Item não encontrado.");
	}
	
	// Decrementa a quantidade de vagas na hora n:
	public String mudarHorario(int n) {
		String temp;
		int aux = this.horarios[n] - 1;
		if(aux < 0){
			temp = "Esse horário já está lotado!";
		}else{
			temp = "Horario reservado com sucesso para "+ n + "hrs";
			this.horarios[n]--;
		}
		return temp;
	}
	
	// Vende o livro no qual o nome se recebe por parametro, se não tiver mais copias, retona
	// uma String dizendo isso, se é possivel a venda, retorna uma String confimando isso
	public String vender(String nome) {
		for (Produto produto : this.produtos) {
			if (produto.getNome().equals(nome)) {
				if (produto.getQuantidade() > 0) {
					produto.setQuantidade(produto.getQuantidade() - 1);
					return "Foi encomendado com sucesso";
				}
				return "Nâo há mais exemplares a venda";
			}
		}
		return "Produto nâo encontrado";
	}

	// Gettes e setters:
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int[] getHorarios() {
		return horarios;
	}
	public void setHorarios(int horarios[]) {
		this.horarios = horarios;
	}
	
	// ToString:
	public String toString() {
		String temp = "";
		int cont = 0;
		for (Produto i: this.produtos) {
			if(cont < 9) temp += "Produto 0" + (cont+1) + ": " + i.getNome() +
					"("+ i.getQuantidade()+ ")"+"\n";
			else temp += "Produto " + (cont+1) + ": " + i.getNome() + "("
					+ i.getQuantidade()+ ")"+ "\n";
			cont++;
		}
		return temp;
	}

	
}
