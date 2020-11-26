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

    public String getDemanda() {
        return demanda;
    }

    public void setDemanda(String demanda) {
        this.demanda = demanda;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public UUID getIdServico() {
        return idServico;
    }

    public void setIdServico(UUID idServico) {
        this.idServico = idServico;
    }

    public UUID getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(UUID codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
}
