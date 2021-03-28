package br.com.tt.petshop.unidades;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arquivo {

    public static List<Unidade> LerUnidadePetshop() throws IOException {

        String nome = null;
        String endereco = null;
        List<Unidade> unidades = new ArrayList<>();

        File file = new File("C:\\Users\\JULI\\Desktop\\petshops.csv");
        Scanner scan = new Scanner(file);

        while (scan.hasNext()){

            String [] petshop = scan.nextLine().split(";");
            nome = petshop[0].trim();
            endereco = petshop[1].trim();
           unidades.add(new Unidade(nome, endereco));
        }
    return unidades;
    }
}
