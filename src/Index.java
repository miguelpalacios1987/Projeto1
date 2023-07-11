import br.com.curso.java.calcular.CalculadoraDeTempo;
import br.com.curso.java.calcular.FiltroRecomendaçao;
import br.com.curso.java.modelo.Episodio;
import br.com.curso.java.modelo.Filme;
import br.com.curso.java.modelo.Serie;

import java.util.ArrayList;

public class Index {
    public static void main(String[] args) {


        Filme filme1 = new Filme ("Rambo", 2023);

        filme1.setDuracaoEmMinutos(180);


        System.out.println("=====================================");
        filme1.exibeFichaTenica();
        System.out.println("=====================================");
        filme1.avalia(8.5);
        filme1.avalia(7.6);
        filme1.avalia(4);
        filme1.avalia(9);
        filme1.avalia(5.6);

        System.out.println(filme1.getTotalDeAvalidaçoes()+"***");

        filme1.exibeFichaTenica();
        System.out.println("=====================================");
        System.out.println(filme1.pegaMedia());
        System.out.println("=====================================");

        System.out.println(filme1.getSumaDasAvaliacoes());

        Serie oS1 = new Serie ("Millonarios F.C",2000);


        oS1.setEpisodiosPorTemporada(986);
        oS1.setDuracaoEmMinutos(259.5);
        oS1.setMinutosPorEpisodio(50);
        oS1.setTemporadas(50);
        oS1.setEpisodiosPorTemporada(15);
        oS1.setMinutosPorEpisodio(152);
        //System.out.println("Duraçao da serie "+ oS1.getDuracaoEmMinutos());
        System.out.println("Duraçao para maratona "+ oS1.getDuracaoEmMinutos());

        Filme filme3= new Filme ("Avatar", 2000);

       // filme3.setNome( "Avatar");

        filme3.setDuracaoEmMinutos(1200);

        CalculadoraDeTempo oC = new CalculadoraDeTempo();

        oC.inclui(filme1);
        oC.inclui(filme3);
        oC.inclui(oS1);
        System.out.println(oC.getTempoTotal());

        FiltroRecomendaçao oF = new FiltroRecomendaçao();

        oF.filtra(filme1);

        Episodio oE = new Episodio ();

        oE.setNumero(1);
        oE.setSerie(oS1);
        oE.setTotalDeVisulicacoes(300);
        oF.filtra(oE);
        System.out.println("OTIMO MEU PAE");

        var filme4 = new Filme("DogVille",2000);
        filme4.setDuracaoEmMinutos(288);
      //  filme4.setNome("Gran Chefom");

        filme4.avalia(10);

        ArrayList <Filme> listaDeFilmes = new ArrayList<>();
        ArrayList <Filme> Lista2 = new ArrayList<>();

        listaDeFilmes.add(filme4);
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme3);
        Lista2.add(filme1);

        System.out.println("Tamanho da lista  "+ listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("ToString do filme"+ listaDeFilmes.get(0).toString());










    }
}