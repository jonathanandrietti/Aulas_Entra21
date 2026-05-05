package Trabalho_Ian_Jonathan;

public class Astronauta {
    private String id;
    private String nome;
    private String especialidade;

    public Astronauta(String id, String nome, String especialidade) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    // Getters
    public String getId() { return id; }
    public String getNome() { return nome; }
    public String getEspecialidade() { return especialidade; }
}
