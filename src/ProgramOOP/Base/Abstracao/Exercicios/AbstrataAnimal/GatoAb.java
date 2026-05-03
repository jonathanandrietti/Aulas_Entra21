package ProgramOOP.Base.Abstracao.Exercicios.AbstrataAnimal;

public class GatoAb extends AnimalAb{
    private String emitirSom;
    private String nome;

    public GatoAb(String emitirSom){
        super(emitirSom);
    }

    @Override
    public void Animal() {
        System.out.println("Miau, miau, miau!");
        System.out.println("Este tipo é um Gato!");
    }

    @Override
    public void Nome() {
        System.out.println("Banguela!");
    }

    public GatoAb(String emitirSom, String nome) {
        super(emitirSom);
        this.nome = nome;
    }
}
