package br.com.curso.java.modelo;

public class Serie extends Titulo{

    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int  minutosPorEpisodio;



    public Serie(String nome, int anoDoLancamento) {
        super(nome,anoDoLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return this.ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return this.episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return this.minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }




    public double getDuracaoEmMinutos(){
        return temporadas *  episodiosPorTemporada *minutosPorEpisodio ;
    }

    @Override
    public String toString() {
        return "Serie  " + this.getNome() + "( " + this.getAnoDoLancamento() + " )";
    }
}