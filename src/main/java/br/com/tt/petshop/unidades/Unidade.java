package br.com.tt.petshop.unidades;

public class Unidade {


    private String nome;
    private String endereco;

    public Unidade(String nome , String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }


    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }


}

