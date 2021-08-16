package trabalhoSD;

public class Cd extends Produto{
    private String banda;
    public Cd(String nome, int id, int qntd, String banda){
        super(nome, id, qntd);
        this.banda = banda;
    }

    public void setBanda(String banda){
        this.banda = banda;
    }

    public String getBanda(){
        return this.banda;
    }
}
