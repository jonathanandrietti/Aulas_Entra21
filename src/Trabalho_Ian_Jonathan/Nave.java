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

    // Getters
    public String getId() { return id; }
    public String getNome() { return nome; }
    public String getTipo() { return tipo; }
    public int getCapacidade() { return capacidade; }

    // Override toString() para exibir dados corretamente
    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + nome + " | Tipo: " + tipo + " | Capacidade: " + capacidade;
    }
}
