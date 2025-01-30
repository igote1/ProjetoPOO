package Model;

public class Responsavel extends Usuario{
   private String endereco;
   private String cpf;

    public Responsavel(String endereco, String cpf, int id, String nome, int idade, String email) {
        super(id, nome, idade, email);
        this.endereco = endereco;
        this.cpf = cpf;
    }

  

    public Responsavel(String cpf, int id, String nome, String email) {
        super(id, nome, email);
        this.cpf = cpf;
        this.endereco = endereco;
    }
    

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

   
    
   }
