package main.set.Pesquisa;


public class Contato {

    private String nome;
    private int numero;

    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return nome + ", " + numero;
    }
}
