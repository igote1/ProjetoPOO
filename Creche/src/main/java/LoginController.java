
import View.Login;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Igor
 */
public class LoginController {

    private final Login view;

    public LoginController(Login view) {
        this.view = view;
    }
    
    
    public void feito(){
        System.out.println(" ");
    
        this.view.exibirMensagem("Executei a função 'feito'");
    
    
    }
    
}
