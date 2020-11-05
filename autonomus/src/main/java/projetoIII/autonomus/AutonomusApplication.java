package projetoIII.autonomus;

import autonomo.ProfissionalAutonomo;
import cliente.Cliente;
import demanda.Demanda;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.ParseException;

@SpringBootApplication
public class AutonomusApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutonomusApplication.class, args);
    }

    private Cliente maria = new Cliente();
    private ProfissionalAutonomo jose = new ProfissionalAutonomo();
    private Demanda demanda = new Demanda();

    public ProfissionalAutonomo cadastrarProfissional() throws ParseException {
        jose.cadastrarFuncionario("Jose", "Silva", "Rua Um",
				10, "Buritis", "BH",
				"Segurança de eventos", "01/01/1990");

        return jose;
    }

    public Cliente cadastrarCliente() throws ParseException {
    	maria.cadastrarCliente("Maria", "Souza", "Rua Dois",
				20, "Estoril", "BH", "02/02/1980"	);

    	return maria;
	}

	public Demanda cadastrarDemanda(){
        demanda.cadastrarDemanda("Segurança", "Precisa-se de um segurança para o Reveillon no bairro Buritis");
        demanda.setCodigoCliente(maria.getCodigoCliente());
        maria.setClienteDaDemanda(demanda.getIdServico());

        return demanda;
    }
    public void avaliarProfissional(){
        jose.setNota(10);
    }

    public void avaliarCLiente(){
        maria.setNota(10);
    }



}
