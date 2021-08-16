package trabalhoSD;

public class Livro extends Produto{
    private String autor;
    public Livro(String nome, int id, int qntd, String autor){
        super(nome, id, qntd);
        this.autor = autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getAutor(){
        return this.autor;
    }
}
