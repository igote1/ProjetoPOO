package Model;

public class Aluno {

    private int id;
    private String nome;
    private Responsavel responsavel;
    private int idade;
    private int serie;

    public Aluno(int id, String nome, Responsavel responsavel, int idade, int serie) {
        this.id = id;
        this.nome = nome;
        this.responsavel = responsavel;
        this.idade = idade;
        this.serie = serie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }
    
    
    
    
}
