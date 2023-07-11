package br.com.curso.java.modelo;

import br.com.curso.java.execao.ErrorDeconversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements  Comparable<Titulo>{



    private String nome;

    private int anoDoLancamento,totalDeAvalidaçoes;
    private boolean  inculsoNoPlano;
    private  double avalidacao;
    private int sumaDasAvaliacoes;

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.Title();

        if(meuTituloOmdb.Year().length() > 4 ){
            throw  new ErrorDeconversaoDeAnoException
                    ("Nao consegui converte o ano porqu te mas de 4 caracretres");        }
        this.anoDoLancamento = Integer.valueOf(meuTituloOmdb.Year());
        this.duracaoEmMinutos =Integer.valueOf(meuTituloOmdb.Runtime().substring(0,2));


    }

    public void setSumaDasAvaliacoes(int sumaDasAvaliacoes) {
        this.sumaDasAvaliacoes = sumaDasAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }



    public void setDuracaoEmMinutos(double duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getTotalAvalidacoes() {
        return totalAvalidacoes;
    }

    public Titulo(String nome, int anoDoLancamento) {
        this.nome = nome;
        this.anoDoLancamento = anoDoLancamento;
    }

    public void setTotalAvalidacoes(int totalAvalidacoes) {
        this.totalAvalidacoes = totalAvalidacoes;
    }

    public void setTotalDeAvalidaçoes(int totalDeAvalidaçoes) {
        this.totalDeAvalidaçoes = totalDeAvalidaçoes;
    }

    public double getAvalidacao() {
        return avalidacao;
    }

    public void setAvalidacao(double avalidacao) {
        this.avalidacao = avalidacao;
    }

    private  int  totalAvalidacoes;
    private double duracaoEmMinutos;

    public double getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public boolean isInculsoNoPlano() {
        return inculsoNoPlano;
    }

    public void setInculsoNoPlano(boolean inculsoNoPlano) {
        this.inculsoNoPlano = inculsoNoPlano;
    }

    public int getAnoDoLancamento() {
        return anoDoLancamento;
    }

    public void setAnoDoLancamento(int anoDoLancamento) {
        this.anoDoLancamento = anoDoLancamento;
    }

    public int getTotalDeAvalidaçoes(){

        return totalDeAvalidaçoes;
    }
    public int getSumaDasAvaliacoes(){
        return sumaDasAvaliacoes;
    }

    public void exibeFichaTenica() {

        System.out.println("Si se puede "+nome);
        System.out.println("A no e "+anoDoLancamento);
        System.out.println(sumaDasAvaliacoes);
        System.out.println(totalAvalidacoes);

    }

    @Override
    public String toString() {
        return "[(nome='" + nome +
                ", anoDoLancamento=" + anoDoLancamento + ","
                + "Duraçao " + duracaoEmMinutos + ")]";


    }

    public void avalia(double nota){

        this.sumaDasAvaliacoes += nota;
        this.totalAvalidacoes ++;
    }
    public double pegaMedia(){
        return sumaDasAvaliacoes / totalAvalidacoes;
    }


    @Override
    public int compareTo(Titulo outro) {
        return this.getNome().compareTo(outro.getNome());
    }
}

