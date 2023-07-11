package br.com.curso.java.modelo;

import br.com.curso.java.calcular.Classificavel;


public class Filme  extends Titulo implements Classificavel {

    private String diretor;


    public Filme(String nome, int anoDoLancamento ) {
        super(nome,anoDoLancamento);
    }

    public String getDiretor() {
        return this.diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public  int getClassificacao(){
        return  (int) pegaMedia() / 2 ;
    }

    @Override
   public String toString() {
        return "Filme : " + this.getNome() + " ( " + this.getAnoDoLancamento() + ")";
    }


}


