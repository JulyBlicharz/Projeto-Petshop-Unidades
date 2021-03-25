package br.com.tt.petshop.unidades;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arquivo {

   // private Unidade unidade;
    List<Unidade> unidades = new ArrayList<>();

    public void LerUnidadePetshop(Unidade unidade) throws IOException {

        File file = new File("C:\\Users\\JULI\\Desktop\\petshops.csv");
        Scanner scan = new Scanner(file);

        while (scan.hasNext()){
            String [] petshop = scan.nextLine().split(";");
            String nome = petshop[0].trim();
            String endereco = petshop[1].trim();
            unidades.add(unidade.getNome());
            unidades.add(unidade.getEndereco());
        }

        for (Unidade unidadesLista: unidades){
            System.out.println(unidadesLista);
        }

    }
}
