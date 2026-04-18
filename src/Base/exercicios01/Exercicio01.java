package Base.exercicios01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        int num;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um Número");
        num = entrada.nextInt();

        if (num > 0){
            System.out.println("É Positivo");
        } else if (num < 0) {
            System.out.println("É Negativo");
        } else {
            System.out.println("É Zero");
        }

    }
}
