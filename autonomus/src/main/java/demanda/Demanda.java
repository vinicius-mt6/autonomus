package demanda;

import cliente.Cliente;

import java.util.UUID;

public class Demanda {

    public Demanda() {
    }

    private String demanda;
    private String descricao;
    private UUID idServico;
    private UUID codigoCliente;

    public String cadastrarDemanda(String demanda, String descricao) {
        this.demanda = demanda;
        this.descricao = descricao;
        idServico = UUID.randomUUID();

        return "Demanda gerada com sucesso. Id do servico é: " + idServico;
    }

    public void setCodigoCliente(UUID codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getDemanda() {
        return demanda;
    }

    public String getDescricao() {
        return descricao;
    }

    public UUID getIdServico() {
        return idServico;
    }

    public UUID getCodigoCliente() {
        return codigoCliente;
    }
}
