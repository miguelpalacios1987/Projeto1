package br.com.curso.java.execao;

public class ErrorDeconversaoDeAnoException extends RuntimeException{

    private String mensagen;
    public ErrorDeconversaoDeAnoException(String mensagem) {
        this.mensagen =mensagem;

    }
    public String getMensagen(){
        return this.mensagen;
    }

}
