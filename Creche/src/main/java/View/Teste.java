
package View;

import Model.Responsavel;
import Model.Aluno;
import Model.Usuario;


public class Teste {
    public static void main(String[] args) {
        Responsavel r = new Responsavel("endereco", "cpf", 0, "nome", 0, "email");
    
      
        Aluno a = new Aluno(0, "nome", r, 0, 0);
   
    }        
}
