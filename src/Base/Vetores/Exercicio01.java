package Base.Vetores;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        String[] nomes = new String[3];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o " + i + "º nome: ");
            nomes[i] = teclado.next();
        }

        for (String nome : nomes) {
            System.out.println(nome);
        }
        teclado.close();
    }
}
