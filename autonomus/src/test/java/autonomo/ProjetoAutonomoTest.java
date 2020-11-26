package autonomo;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

public class ProjetoAutonomoTest {

    private ProfissionalAutonomo profissionalAutonomo;

    public void cadastrarFuncionario(ProfissionalAutonomo profissional) {
        ProfissionalAutonomo profissionalAutonomo = new ProfissionalAutonomo();
        profissionalAutonomo.setNome(profissional.getNome());
        profissionalAutonomo.setSobrenome(profissional.getSobrenome());
        profissionalAutonomo.setEndereco(profissional.getEndereco());
        profissionalAutonomo.setNumero(profissional.getNumero());
        profissionalAutonomo.setBairro(profissional.getBairro());
        profissionalAutonomo.setCidade(profissional.getCidade());
        profissionalAutonomo.setServicoOfertado(profissional.getServicoOfertado());

        this.profissionalAutonomo = profissionalAutonomo;
    }



    @Test
    @SneakyThrows
    public void deveCadastrarProfissional(){
        //Arrange
        ProfissionalAutonomo jose = new ProfissionalAutonomo();
        jose.setNome("Jose");
        jose.setSobrenome("Silva");
        jose.setEndereco("Rua um");
        jose.setNumero(10);
        jose.setBairro("Buritis");
        jose.setCidade("BH");
        jose.setServicoOfertado("Segurança de eventos");

        //Act
        this.cadastrarFuncionario(jose);

        //Assert
        Assertions.assertEquals(jose.getNome(), profissionalAutonomo.getNome());
        Assertions.assertEquals(jose.getEndereco(), profissionalAutonomo.getEndereco());


    }
}
