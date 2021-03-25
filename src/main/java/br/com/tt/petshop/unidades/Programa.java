package br.com.tt.petshop.unidades;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Programa {

    public static void main(String[] args) throws SQLException, IOException {
        //Criar uma classe Arquivo que le e retorna as petshop's (List<unidades>)
        // Criar uma instania de concexao, no database db_aluno3 (OK)
        //Fazer um for na listaDeUniadades, inserinf cada unidade na tabela tb_unidade (id, nome, endereco)

        Conexao minhaConexao = new Conexao();

//        Arquivo arquivo = new Arquivo();
//
//        arquivo.LerUnidadePetshop();

        String usuario = "admin";
        String senha = "Imers40JavaAdmin";
        String url = "jdbc:postgresql://165.227.108.225:5432/db_aluno3";
        minhaConexao.conectar(url, usuario, senha);




    }

}
