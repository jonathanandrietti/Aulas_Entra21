package ProgramOOP.Base.Herança.Exercícios;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("0 - Sair");
            System.out.println("1 - Exercício 1 - Pessoa e Aluno");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Executa o código do exercício
                    Pessoa pessoa = new Pessoa("Jonathan A.", 40);
                    Aluno aluno = new Aluno("Jonathan Andrietti", 40, "12451254215");

                    aluno.exibir();

                    System.out.println(aluno.getNome());
                    System.out.println(aluno.getIdade());
                    System.out.println(aluno.getMatricula());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
