package login;

import autonomo.ProfissionalAutonomo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest {

    private String login;

    public void cadastrarLogin(ProfissionalAutonomo profissionalAutonomo){
        login = profissionalAutonomo.getNome() + profissionalAutonomo.getSobrenome();
    }

    @Test
    public void deveCadastrarLogin(){
        ProfissionalAutonomo profissionalAutonomo = new ProfissionalAutonomo();
        profissionalAutonomo.setNome("Pedro");
        profissionalAutonomo.setSobrenome("Soares");

        this.cadastrarLogin(profissionalAutonomo);

        Assertions.assertEquals("PedroSoares", login);
    }

}
