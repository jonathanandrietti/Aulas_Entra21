package ProgramOOP.Base.Encapsulamento.Exercicios.Exercicio3;

public class mainIdentidade {
    public static void main(String[] args) {

        // Criando objeto da classe Identidade
        Identidade id = new Identidade("12345678900", "João");

        // Exibindo os dados usando getters
        System.out.println("CPF: " + id.getCpf());
        System.out.println("Nome: " + id.getNome());
    }
}
