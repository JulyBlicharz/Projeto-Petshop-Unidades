package br.com.tt.petshop.unidades;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arquivo {

  public void LerUnidadePetshop(Unidade unidade) throws IOException {

        String nome = null;
        String endereco = null;
        List<Unidade> unidades = new ArrayList<>();
        Unidade unidade = new Unidade(nome, endereco);
       
        File file = new File("C:\\Users\\JULI\\Desktop\\petshops.csv");
        Scanner scan = new Scanner(file);

        while (scan.hasNext()){
            String [] petshop = scan.nextLine().split(";");
            nome = petshop[0].trim();
            endereco = petshop[1].trim();
           unidades.add(new Unidade(unidade.getNome(), unidade.getEndereco()));
        }

        for (Unidade unidadesLista: unidades){
            System.out.println(unidadesLista);
        }

    }
}
