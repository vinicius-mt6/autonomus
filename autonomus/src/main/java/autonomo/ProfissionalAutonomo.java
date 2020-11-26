package autonomo;

import login.Login;
import login.Senha;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProfissionalAutonomo {

    public ProfissionalAutonomo() {
    }

    SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");

    private String nome;
    private String sobrenome;
    private String endereco;
    private int numero;
    private String bairro;
    private String cidade;
    private String servicoOfertado;
    private Login login;
    private Senha senha;
    private double nota = 0;
    private int contadorDeNota;


    public String cadastrarFuncionario(String nome, String sobrenome, String endereco, int numero,
                                String bairro, String cidade, String servicoOfertado) throws ParseException {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.servicoOfertado = servicoOfertado;

        login.gerarLogin(nome,sobrenome);
        senha.criarSenha();

        return nome + " foi cadastrado com sucesso!";

    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {

        this.contadorDeNota++;

        Scanner lerNota = new Scanner(System.in);
        if(nota>10||nota<0){
            while (nota>10||nota<0) {
                System.out.println("Insira uma nota entre 0 e 10");
                lerNota.hasNext();
            }
        }

        double soma = this.nota + nota;
        this.nota = soma/contadorDeNota;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getServicoOfertado() {
        return servicoOfertado;
    }

    public void setServicoOfertado(String servicoOfertado) {
        this.servicoOfertado = servicoOfertado;
    }
}
