package ProgramOOP.Base.exemplo1;

public class Pessoa {
    String nome;
    int idade;
    double peso;

    public Pessoa(){}

    public Pessoa(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    void apresentar(){
        System.out.print("Olá! Meu nome é " + this.nome);
        System.out.print(" | Idade: " + this.idade);
        System.out.println(" | Peso: " + this.peso);
    }
}
