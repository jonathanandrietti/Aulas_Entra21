package ProgramOOP.Base.exercicios;

import ProgramOOP.Base.exemplo1.Carro;

import java.util.Scanner;

public class Master {
    public static void main(String[] args) {
        int opcao;

        Scanner selecao = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha opção abaixo do exercício!");
            System.out.println("1 - Verificar Aluno");
            System.out.println("2 - Verificar Conta Bancária");
            System.out.println("3 - Sair");

            opcao = selecao.nextInt();

            switch (opcao) {
                case 1: {
                    Alunos aluno = new Alunos("Jonathan", 40);
                    aluno.estudar();
                    System.out.println("\n\n");
                    break;
                    //return;
                }
                case 2: {
                    int conta, agencia;
                    double valorS;

                    System.out.println("Informe a Conta: ");
                    conta = selecao.nextInt();
                    System.out.println("Informe a Agencia: ");
                    agencia = selecao.nextInt();

                    ContaBancaria contaBancaria = new ContaBancaria(123456, 456, "Jonathan",
                            "05551883965", 550);

                    if (contaBancaria.nConta == conta && contaBancaria.nAgencia == agencia) {
                        contaBancaria.sacar();

                        while (true) {
                            System.out.println("O que deseja fazer?");
                            System.out.println("1 - Sacar");
                            System.out.println("2 - Depositar");
                            System.out.println("3 - Voltar ao Topo");

                            opcao = selecao.nextInt();

                            switch (opcao) {
                                case 1: {
                                    System.out.println("Informe o valor para Saque: ");
                                    valorS = selecao.nextDouble();
                                    contaBancaria.valor = contaBancaria.valor - valorS;
                                    System.out.println("Saldo atual é de : R$" + contaBancaria.valor);
                                    System.out.println("\n\n");
                                    break;
                                }
                                case 2: {
                                    System.out.println("Informe o valor para Depositar: ");
                                    valorS = selecao.nextDouble();
                                    contaBancaria.valor = contaBancaria.valor + valorS;
                                    System.out.println("Saldo atual é de : R$" + contaBancaria.valor);
                                    System.out.println("\n\n");
                                    break;
                                }
                                case 3:{
                                    System.out.println("Saindo da Conta...");
                                    selecao.close();
                                }
                            }
                        }
                        } else{
                            System.out.println("Conta ou Agência inválida!");
                    }
                    break; // Adicione o break no final do case 2
                }
                case 3: {
                    System.out.println("Saindo do programa...");
                    selecao.close();
                    return; // Sai do método main
                }
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
