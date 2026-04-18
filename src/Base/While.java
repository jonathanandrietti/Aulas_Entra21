package Base;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int cont = 1;
        int numero;

        Scanner teclado = new Scanner(System.in);

        while (cont <= 3) {
            System.out.println("Digite o " + cont + "º numero:");
            numero = teclado.nextInt();

            cont = cont + 1;
        }
    }
}