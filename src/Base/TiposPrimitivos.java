package Base;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        byte numeroMuitoPequeno = 12;
        short numeroPequeno = 1000;
        int numeroNormal = 23457890;
        long numeroGrandao = 1234569800;

        System.out.println(numeroMuitoPequeno);
        System.out.println(numeroPequeno);
        System.out.println(numeroNormal);
        System.out.println(numeroGrandao);
        System.out.println("_______________________________________________________");

        //Tipos de números reais
        float numeroBurro = 24.6f;
        double numeroReal = 123.121;
        System.out.println(numeroBurro);
        System.out.println(numeroReal);

        float a = 0.2f;
        float b = 0.1f;
        float x = a + b;
        System.out.println(a + b);
        System.out.println("_______________________________________________________");
        // Char e o Boolean
        char caracte = 'v';
        boolean falso = false;
        boolean verdadeiro = true;
        System.out.println(caracte);
        System.out.println(falso);
        System.out.println(verdadeiro);
    }

    public static class TesteWhile {
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
}
