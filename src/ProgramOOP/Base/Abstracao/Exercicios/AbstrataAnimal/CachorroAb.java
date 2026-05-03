package ProgramOOP.Base.Abstracao.Exercicios.AbstrataAnimal;

public class CachorroAb extends AnimalAb{
    private String emitirSom;
    private String nome;

    public CachorroAb(String emitirSom){
        super(emitirSom);
    }

    @Override
    public void Nome() {
        System.out.println("Boby");
    }

    public CachorroAb(String emitirSom, String nome) {
        super(emitirSom);
        this.nome = nome;
    }

    @Override
    public void Animal() {
        System.out.println("Au au au au!");
        System.out.println("Este tipo é um Cachorro!");
    }
}
