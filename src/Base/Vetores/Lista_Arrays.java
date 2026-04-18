package Base.Vetores;

import java.util.Scanner;

public class Lista_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        while (true) {
            System.out.println("Escolha uma opção abaixo digitando o número:");
            System.out.println("1 - Lista de Idades");
            System.out.println("2 - Média de Notas");
            System.out.println("3 - Inverter Array");
            System.out.println("4 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: {
                    int[] idades = new int[7];

                    for (int i = 0; i < idades.length; i++) {
                        System.out.print("Informe a " + (i + 1) + "ª idade: ");
                        idades[i] = scanner.nextInt();
                    }
                    System.out.println();
                    System.out.println("_______________________________________________________");
                    System.out.println();
                    System.out.println("Idades informadas:");
                    for (int i = 0; i < idades.length; i++) {
                        System.out.println("Posição " + i + ": " + idades[i]);
                    }
                    break;
                }
                case 2: {
                    float notas[] = new float[4];
                    float media = 0;

                    for (int i = 0; i < notas.length; i++) {
                        System.out.println("Informe a " + (i + 1) + "ª nota: ");
                        notas[i] = scanner.nextFloat();
                        media += notas[i];
                    }
                    media /= notas.length;
                    System.out.println("Média das Notas: " + media);
                    break;
                }
                case 3: {
                    int num[] = {1, 2, 3, 4, 5};
                    System.out.println("Array invertido:");
                    for (int i = num.length - 1; i >= 0; i--) {
                        System.out.println("Posição " + i + ": " + num[i]);
                    }
                    break;
                }
                case 4: {
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                }
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
