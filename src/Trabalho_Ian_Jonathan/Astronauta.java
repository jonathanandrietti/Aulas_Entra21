package Trabalho_Ian_Jonathan;

public class Astronauta {
    private String id;
    private String nome;
    private String especialidade;

    public Astronauta(String s, String nome, String especialidade) {
        this.id = generateId();
        this.nome = nome;
        this.especialidade = especialidade;
    }

    private String generateId() {
        return "A" + System.currentTimeMillis();
    }

    // Getters e Setters
    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) { this.nome = nome; }
    public String getEspecialidade() { return especialidade; }
    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }
}
