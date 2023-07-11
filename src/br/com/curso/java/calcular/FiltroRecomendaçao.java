package br.com.curso.java.calcular;

public class FiltroRecomendaçao {



    public void filtra(Classificavel clasificavel){

        if (clasificavel.getClassificacao() >= 4){
            System.out.println("Esta entre os preferidos");
        } else if (clasificavel.getClassificacao() >=2){
            System.out.println("Muito bem avalidado no momemto");
        } else {
            System.out.println("Coloque na sua lista para asisitr logo");
        }


    }

}
