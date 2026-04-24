package ProgramOOP.Base.exemplo1;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(  "Jonathan",  40, 115);
        Pessoa pessoa2 = new Pessoa( "Jennifer", 4, 35);

        /* pessoa1.nome = "Jonathan"; //Aqui não importa a ordem dos fatores, segue de onde está instanciado!
        pessoa1.peso = 115;
        pessoa1.idade = 40; */

        /* pessoa2.nome = "Jennifer";
        pessoa2.idade = 4;
        pessoa2.peso = 32; */

        //pessoa1.apresentar();
        //pessoa2.apresentar();

        Carro carro1 = new Carro();
        carro1.ano = 2000;
        carro1.cor = "Preto";
        carro1.marca = "Pilantra";
        carro1.modelo = "Deixa na mão";
        carro1.dono = pessoa1;

        carro1.Ligar();
    }
}
