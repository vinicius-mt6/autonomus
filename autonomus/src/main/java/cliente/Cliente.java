package cliente;

import demanda.Demanda;
import login.Login;
import login.Senha;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

public class Cliente {

    public Cliente() {
    }

    SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");

    private UUID codigoCliente;
    private String nome;
    private String sobrenome;
    private String endereco;
    private int numero;
    private String bairro;
    private String cidade;
    private Date nascimento;
    private Login login;
    private Senha senha;
    private double nota;
    private int contadorDeNotas = 0;
    private UUID clienteDaDemanda;

    public String cadastrarCliente(String nome, String sobrenome, String endereco, int numero, String bairro, String cidade, String nascimento) throws ParseException {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.nascimento = dataFormatada.parse(nascimento);
        this.codigoCliente = UUID.randomUUID();

        login.gerarLogin(nome,sobrenome);
        senha.criarSenha();

        return nome + " foi cadastrado com sucesso!";
    }

    public UUID getCodigoCliente() {
        return codigoCliente;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {

        this.contadorDeNotas++;

        Scanner lerNota = new Scanner(System.in);
        if(nota>10||nota<0){
            while (nota>10||nota<0) {
                System.out.println("Insira uma nota entre 0 e 10");
                lerNota.hasNext();
            }
        }

        double soma = this.nota + nota;
        this.nota = soma/contadorDeNotas;

    }

    public UUID getClienteDaDemanda() {
        return clienteDaDemanda;
    }

    public void setClienteDaDemanda(UUID clienteDaDemanda) {
        this.clienteDaDemanda = clienteDaDemanda;
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

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
}
