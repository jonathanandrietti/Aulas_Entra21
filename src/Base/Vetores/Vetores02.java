package Base.Vetores;

public class Vetores02 {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        numeros[3] = 15;
        System.out.println(numeros[0]);
        System.out.println(numeros[3]);

        char[] caracteres = new char[3];
        System.out.println(caracteres[1]);

        boolean[] logico = new boolean[3];
        System.out.println(logico[1]);

        String[] texto = new String[3];
        texto[1] = "Quaiquer";
        System.out.println(texto[1]);
        System.out.println(texto[2]);
    }
}
