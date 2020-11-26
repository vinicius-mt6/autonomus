package cliente;

import autonomo.ProfissionalAutonomo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

public class ClienteTeste {

    private Cliente cliente;

    public void cadastrarCliente(Cliente cliente) {
        Cliente maria = new Cliente();
        maria.setNome(cliente.getNome());
        maria.setSobrenome(cliente.getSobrenome());
        maria.setEndereco(cliente.getEndereco());
        maria.setNumero(cliente.getNumero());
        maria.setBairro(cliente.getBairro());
        maria.setCidade(cliente.getCidade());

        this.cliente = cliente;
    }

    @Test
    public void deveCadastrarCliente(){
        Cliente maria = new Cliente();
        maria.setNome("Maria");
        maria.setSobrenome("Souza");
        maria.setEndereco("Rua Dois");
        maria.setNumero(20);
        maria.setBairro("Estoril");
        maria.setCidade("BH");

        this.cadastrarCliente(maria);

        Assertions.assertEquals(maria.getNome(), cliente.getNome());
    }

}
