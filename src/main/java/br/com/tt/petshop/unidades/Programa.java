package br.com.tt.petshop.unidades;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Programa {


    public static void main(String[] args) throws SQLException, IOException {
        //Criar uma classe Arquivo que le e retorna as petshop's (List<unidades>)
        // Criar uma instania de concexao, no database db_aluno3 (OK)
        //Fazer um for na listaDeUniadades, inserir cada unidade na tabela tb_unidade (id, nome, endereco)

        Conexao minhaConexao = new Conexao();
        Arquivo arquivo = new Arquivo();

         for (Unidade listaDeUniadades: Arquivo.LerUnidadePetshop()){
             System.out.println(listaDeUniadades.getDescricaoUnidades());
        }


        String usuario = "admin";
        String senha = "Imers40JavaAdmin";
        String url = "jdbc:postgresql://pg.lptn.com.br:5432/db_aluno3";
        minhaConexao.conectar(url, usuario, senha);


         for (Unidade listaDeUniadades: Arquivo.LerUnidadePetshop()){
             String sql = "insert into tb_unidade (nome, endereco) values (?,?);";
            try {
                PreparedStatement preparedStatement = minhaConexao.inserir(sql);
                preparedStatement.setString(1, listaDeUniadades.getNome());
                preparedStatement.setString(2, listaDeUniadades.getEndereco());
                preparedStatement.execute();
                preparedStatement.close();
            }catch (SQLException e){
                throw new SQLException("Erro Sql");
            }
             //System.out.println(listaDeUniadades.getDescricaoUnidades());
        }

        //String sql = "insert into tb_unidade (nome, endereco) values ('?', '?');";
        // String nome String endereco;
        //minhaConexao.inserir(sql);

    }

}
