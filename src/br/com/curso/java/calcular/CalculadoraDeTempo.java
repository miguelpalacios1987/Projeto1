package br.com.curso.java.calcular;

import br.com.curso.java.modelo.Titulo;


public class CalculadoraDeTempo {

    private int tempoTotal;





    public int getTempoTotal(){
        return this.tempoTotal;
    }

//    public void inclui(Filme f){
//
//        this.tempoTotal += f.getDuracaoEmMinutos();
//
//
//    }
//
//
//    public void inclui(Serie s) {
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }
public void inclui(Titulo titulo){
    System.out.println("Adicionando valor em minutos de  "+titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();

}
}
