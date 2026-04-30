package ProgramOOP.Base.Polimorfismo.Aula.Exemplo3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem Vindo!");
        System.out.println("Digite o valor da Compra: ");
        double valorDaCompra = scanner.nextDouble();

        int formaDePagto;
        do {

            System.out.println("Escolha a forma de pagamento");
            System.out.println("0 - Sair");
            System.out.println("1 - PIX");
            System.out.println("2 - Boleto");
            System.out.println("3 - Crédito");

            CArrinho carrinho = new CArrinho(valorDaCompra);
            formaDePagto = scanner.nextInt();

            switch (formaDePagto) {
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1: {
                    carrinho.realizarCompra(new PIX());
                    break;
                }
                case 2: {
                    carrinho.realizarCompra(new Boleto());
                    break;
                }
                case 3: {
                    carrinho.realizarCompra(new Credito());
                    break;
                }
                default: {
                    //throw new IllegalArgumentException();
                    System.out.println("Opção não encontrada, processo finalizado, tente novamente!");
                    return;
                }
            }
        } while (formaDePagto != 0);

    }
}
