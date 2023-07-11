package br.com.curso.java.principal;
import br.com.curso.java.execao.ErrorDeconversaoDeAnoException;
import br.com.curso.java.modelo.Titulo;
import br.com.curso.java.modelo.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.http.HttpClient;
import java.net.URI;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class principalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        String busca = "";

        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingStrategy(FieldNamingPolicy
                        .UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();


        while (!busca.equalsIgnoreCase("sair")) {

            System.out.println("Digite um filme para buscar");
            busca = leitura.nextLine();

            if(busca.equalsIgnoreCase("sair")){
                break;
            }

            String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=509e380a";
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();

                System.out.println(json);



                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println("Tilulo = " + meuTituloOmdb);

                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("Meu titulo ja convertido");
                System.out.println(meuTitulo);

          /*    FileWriter escrita = new FileWriter("Fimes.txt");
                escrita.write(meuTitulo.toString());
                escrita.close();
          */
                titulos.add(meuTitulo);
            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um error:");
                System.out.println(e.getMessage());

            } catch (IllegalArgumentException e) {
                System.out.println("Algum erro de argumento na busca, verifique o endereço");
            } catch (ErrorDeconversaoDeAnoException e) {
                System.out.println(e.getMensagen());
            }
            System.out.println(titulos);
            FileWriter escrita2 = new FileWriter("filme2.json");
            escrita2.write(gson.toJson(titulos));
            escrita2.close();
            System.out.println("Programa finalizo corretamente");

        }
    }

}
