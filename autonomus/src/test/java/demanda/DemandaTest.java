package demanda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.UUID;

public class DemandaTest {

    private Demanda demanda;

    public void cadastrarDemanda(Demanda demanda){
        Demanda demanda1 = new Demanda();
        demanda1.setCodigoCliente(demanda.getCodigoCliente());
        demanda1.setDescricao(demanda.getDescricao());
        demanda1.setDemanda(demanda.getDemanda());
        demanda1.setDemanda(demanda.getIdServico().toString());

        this.demanda = demanda1;
    }

    @Test
    public void deveCadastrarDemanda(){
        Demanda novaDemanda = new Demanda();
        novaDemanda.setDemanda("Demanda");
        novaDemanda.setDescricao("Descrição");
        novaDemanda.setCodigoCliente(UUID.randomUUID());
        novaDemanda.setIdServico(UUID.randomUUID());

        this.cadastrarDemanda(novaDemanda);

        Assertions.assertEquals(novaDemanda.getCodigoCliente(), demanda.getCodigoCliente());
    }
}
