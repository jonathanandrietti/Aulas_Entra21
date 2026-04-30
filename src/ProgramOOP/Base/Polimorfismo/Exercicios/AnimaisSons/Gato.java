package ProgramOOP.Base.Polimorfismo.Exercicios.AnimaisSons;

public class Gato extends Animal{

    @Override
    public void tipoAnimal() {
        System.out.println("Este é um Gato chamado Cavaleiro das Trevas (Apelido Negão ou Banguela)!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau, miau, miau...");
    }
}