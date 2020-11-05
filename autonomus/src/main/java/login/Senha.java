package login;

import java.util.Scanner;

public class Senha {

    public Senha() {
    }

    public String senha;
    Scanner novaSenha = new Scanner(System.in);

    public void criarSenha(){
        System.out.println("Insira uma senha: ");
        this.senha = novaSenha.nextLine();
    }

}
