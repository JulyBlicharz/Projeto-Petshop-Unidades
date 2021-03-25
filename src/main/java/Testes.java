import br.com.tt.petshop.unidades.Unidade;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Testes {


    public static void main(String[] args) throws IOException {

            List<String> unidadePetshop = new ArrayList<>();
            List<String> enderecoPetshop = new ArrayList<>();

            File file = new File("C:\\Users\\JULI\\Desktop\\petshops.csv");
            Scanner scan = new Scanner(file);

                  while (scan.hasNext()){

                      String [] petshop = scan.nextLine().split(";");
                      String nome = petshop[0].trim();
                      String endereco = petshop[1].trim();
                      unidadePetshop.add(nome);
                      enderecoPetshop.add(endereco);
                  }
                  for (String unidades: unidadePetshop){
                  System.out.println(unidades);
                  }



    }
}
