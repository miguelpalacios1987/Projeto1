package br.com.curso.java.principal;

import br.com.curso.java.modelo.Filme;
import br.com.curso.java.modelo.Serie;
import br.com.curso.java.modelo.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.LinkedList;

public class PrincipalConListas {
    public static void main(String[] args) {

        Filme filme1 = new Filme("Rambo", 2023);
        Filme filme3 = new Filme("Avatar", 2000);
        var filme4 = new Filme("DogVille", 2000);
        Serie oS1 = new Serie("Millonarios F.C", 2000);
        filme1.avalia(8);
        filme3.avalia(8);
        filme4.avalia(9);
        oS1.avalia(10);
        Filme f1 = filme1;

        ArrayList<Titulo> lista = new ArrayList<>();
        ArrayList<Titulo> lista3 = new ArrayList<>();

        lista.add(filme4);
        lista.add(filme1);
        lista.add(filme3);
        lista.add(oS1);
        lista3.add(oS1);
        lista3.add(filme3);
        lista3.add(filme4);

        System.out.println("Tamanho da lista 3 " + lista3.size());
        System.out.println("O nome do primeiro Filme da lista  e " + lista3.get(0).getNome()
        );
        System.out.println(lista3);


        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificacao " + filme.getClassificacao());
            }

            for (Titulo item2 : lista3) {
                System.out.println(item.getNome());
                if (item2 instanceof Filme filme && filme.getClassificacao() > 2) {
                    System.out.println("Classificacao " + filme.getClassificacao());
                }


                List<String> buscaPorArtista = new LinkedList<>();
                buscaPorArtista.add("Vini");
                buscaPorArtista.add("Mateus");
                buscaPorArtista.add("Wiliiam");
                buscaPorArtista.add("Edu");
                buscaPorArtista.add("Pamera");
                buscaPorArtista.add("Pricyla");
                buscaPorArtista.add("Helena");
                System.out.println(buscaPorArtista);

                Collections.sort(buscaPorArtista);

                System.out.println("Depois da oredenaçao ");
                System.out.println(buscaPorArtista);
                System.out.println("Ordenado ");
                Collections.sort(lista);
                System.out.println(lista);
                lista.sort(Comparator.comparing(Titulo::getAnoDoLancamento));
                System.out.println(lista);


            }
        }
    }
}
