package ProgramOOP.Base.Herança.Aula.exemplos1;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(int idade, String nome){
        this.idade = idade;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0){
            System.out.println("Idade não pode ser negativa");
        } else {
            this.idade = idade;
        }
    }
}
