package Base;

public class Condicionais {
    public static void main(String[] args) {
        //Se
        if (1 > 5){
            System.out.println("Maior");
        } else { //Senao
            System.out.println("Menor");
        }

        int idade = 18;

        if (idade < 18){
            System.out.println("Menor de Idade");
        } else if (idade == 18) {
            System.out.println("18 Anos");
        } else {
            System.out.println("Maior de Idade");
        }

        String corCamisa = "preto e branco";
        String corCamisaDois = "Alvinegro";

        // 1| == ou
        if (corCamisa == "preto e branco" || corCamisa == "Alvinegro") {
            System.out.println("Vasco");
        }

            int ano = 2020;
        // && == e
         if (ano >= 2000 && ano <= 2999) {
             System.out.println("Século 21");
         }
    }
}
