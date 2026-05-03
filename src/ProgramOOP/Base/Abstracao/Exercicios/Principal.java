package ProgramOOP.Base.Abstracao.Exercicios;

import ProgramOOP.Base.Abstracao.Exercicios.AbstrataAnimal.AnimalAb;
import ProgramOOP.Base.Abstracao.Exercicios.AbstrataAnimal.CachorroAb;
import ProgramOOP.Base.Abstracao.Exercicios.AbstrataAnimal.GatoAb;
import ProgramOOP.Base.Abstracao.Exercicios.AbstratoVeiculo.Bicicleta;
import ProgramOOP.Base.Abstracao.Exercicios.AbstratoVeiculo.Carro;
import ProgramOOP.Base.Abstracao.Exercicios.AbstratoVeiculo.Skate;
import ProgramOOP.Base.Abstracao.Exercicios.AbstratoVeiculo.Windsurf;

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
            System.out.println("1 - Classe Abstrata Animal");
            System.out.println("2 - Veículos em movimento");
            System.out.println();

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
                    System.out.println();

                    switch (opcao){
                        case 1:
                            CachorroAb cachorro = new CachorroAb("","");
                            System.out.print("Seu nome é: ");
                            cachorro.Nome();
                            cachorro.Animal() ;
                            System.out.println();
                            break;

                        case 2:
                            GatoAb gato = new GatoAb("","");
                            System.out.print("Seu nome é: ");
                            gato.Nome();
                            gato.Animal();
                            System.out.println();
                            break;

                        default:
                            System.out.println("Opção Inválida!");
                            System.out.println();
                            break;
                    }
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Acessando dados de Veículos....");
                    System.out.println("Escolha um veículo da lista:");
                    System.out.println("1 - Carro");
                    System.out.println("2 - Bicicleta");
                    System.out.println("3 - Stake");
                    System.out.println("4 - Windsurf");
                        opcao = scanner.nextInt();
                    System.out.println();

                    switch (opcao) {
                        case 1:
                            System.out.println("Selecionado: Carro");
                            Carro carro = new Carro("");
                            carro.mover();
                            System.out.println();
                            break;

                        case 2:
                            System.out.println("Selecionado: Bicicleta");
                            Bicicleta bicicleta = new Bicicleta("");
                            bicicleta.mover();
                            System.out.println();
                            break;

                        case 3:
                            System.out.println("Selecionado: Skate");
                            Skate skate = new Skate("");
                            skate.mover();
                            System.out.println();
                            break;

                        case 4:
                            System.out.println("Selecionado: Windsurf");
                            Windsurf windsurf = new Windsurf("");
                            windsurf.mover();
                            System.out.println();
                            break;

                        default:
                            System.out.println("Opção Inválida!");
                            System.out.println();
                            break;
                    }
                    break;

                case 3:

                    break;

            }

        } while (opcao != 0);


    }
}
