package Base.Vetores;

public class Matrizes {
    public static void main(String[] args) {
        int[][] matriz = new int[2][4];

        matriz[0][0] = 3;
        matriz[1][3] = 5;

        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.println(valor);
            }
        }
    }
}
