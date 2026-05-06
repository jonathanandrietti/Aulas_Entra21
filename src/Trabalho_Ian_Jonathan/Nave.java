package Trabalho_Ian_Jonathan;

public class Nave {
    private String id;
    private String nome;
    private String tipo;
    private int capacidade;

    public Nave(String id, String nome, String tipo, int capacidade) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.capacidade = capacidade;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCapacidade() {
        return capacidade;
    }
}
