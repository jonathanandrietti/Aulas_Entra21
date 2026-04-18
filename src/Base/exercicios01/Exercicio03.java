package Base.exercicios01;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        int idiomaSelecionado;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        idiomaSelecionado = teclado.nextInt();

        switch (idiomaSelecionado) {
            case 1: {
                System.out.println("Welcome!");
                break;

            }

            case 2: {
                System.out.println("Bienvenido!");
                break;

            }

            case 3: {
                System.out.println("Bem vindo em Frânces");

            }
        }
    }
}