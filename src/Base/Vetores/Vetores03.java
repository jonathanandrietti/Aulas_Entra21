package Base.Vetores;

public class Vetores03 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,10,15};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println();
        System.out.println("Valor direto sem contar:");
        for (int numero:numeros){
            System.out.println(numero);
        }
    }
}
