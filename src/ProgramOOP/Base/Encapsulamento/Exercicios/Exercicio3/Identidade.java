package ProgramOOP.Base.Encapsulamento.Exercicios.Exercicio3;

/* Exercício 3: Getter sem Setter

Crie uma classe Identidade com atributos privados cpf e nome . Implemente apenas
getters públicos (sem setters). O CPF e nome devem ser definidos apenas no
construtor e não podem ser alterados depois. */

public class Identidade {

    private String cpf;
    private String nome;

    // Construtor (obrigatório para definir os valores)
    public Identidade(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    // Getter para CPF
    public String getCpf() {
        return cpf;
    }

    // Getter para Nome
    public String getNome() {
        return nome;
    }
}
