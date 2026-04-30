package ProgramOOP.Base.Polimorfismo.Exercicios.AnimaisSons;

public class Cachorro extends Animal{

    @Override
    public void tipoAnimal() {
        System.out.println("Este é um Cachorro chamado Boby!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au au...rsrsrrs");
    }
}
