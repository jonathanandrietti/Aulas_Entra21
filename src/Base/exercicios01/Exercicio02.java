package Base.exercicios01;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        /*int num1, num2, num3, cont;
        cont = 0;

        Scanner teclado = new Scanner(System.in);

        if (cont < 3) {
            System.out.println("Digite o primeiro numero");
            cont = cont + 1;
        }*/
        int num1, num2, num3;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num1 = teclado.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = teclado.nextInt();
        System.out.print("Digite o terceiro número: ");
        num3 = teclado.nextInt();

        if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("Dois iguais");
        } else {
            System.out.println("Nenhum igua");
        }

    }
}