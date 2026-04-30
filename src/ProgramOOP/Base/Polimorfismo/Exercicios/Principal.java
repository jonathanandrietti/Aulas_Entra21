package ProgramOOP.Base.Polimorfismo.Exercicios;

import ProgramOOP.Base.Polimorfismo.Exercicios.AnimaisSons.Animal;
import ProgramOOP.Base.Polimorfismo.Exercicios.AnimaisSons.Cachorro;
import ProgramOOP.Base.Polimorfismo.Exercicios.AnimaisSons.Gato;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Chama a função ler o que o usuário escreve ou responde
        //Definir as variáveis
        int opcao; //definir para receber a opção escolhida

        System.out.println("Atividades enviadas para exercitar: 50"); //Usar sout para gerar as informações na tela definida pelo Programador
        System.out.println(); //sout + Enter para montar a estrutura
        System.out.println("Carregando opçães para estar conforme vai finalizando!");

        do{ //Função de repetição entando não digtar o valor para Sair da Função
            System.out.println("Escolha a Atividade a ser executada!");
            System.out.println("0 - Sair do Menu e Encerrar Sistema!");
            System.out.println("1 - Animais e Sons");
            System.out.println("2 - Veículos em movimento");

            opcao = scanner.nextInt(); //Recebe a opção digitada pelo usuário

            switch (opcao){ //Método de opção de escolha
                case 0:  //Opção de escolha conforme indicado acima
                    System.out.println("Saindo do menu de escolha!");
                    System.out.println("obrigado por testar as opções implantadas!");
                    break;

                case 1:
                    System.out.println("Escolha a opção Abaixo");
                    System.out.println("1 - Cachorro");
                    System.out.println("2 - Gato");
                    opcao = scanner.nextInt();
                    Animal animalt1 = new Animal(); //Aqui exibe a mensagem da tela Animal
                    Animal Boby = new Cachorro(); // Aqui exibe a mensagem do Cachorro - emitirSom
                    Animal tipo = new Cachorro(); // Aqui exibe a mensagem do Cachorro - tipoAnimal

                    Animal animalt2 = new Animal();
                    Animal Banguela = new Gato();
                    Animal tipo1 = new Gato();

                    switch (opcao){
                        case 1:
                            Boby.emitirSom();
                            animalt1.tipoAnimal();
                            tipo.tipoAnimal();
                            System.out.println();
                            break;

                        case 2:
                            Banguela.emitirSom();
                            animalt2.tipoAnimal();
                            tipo1.tipoAnimal();
                            System.out.println();
                            break;

                        default:
                            System.out.println("Opção Inválida!");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Desenvolvendo....");
            }

        } while (opcao != 0);


    }
}
