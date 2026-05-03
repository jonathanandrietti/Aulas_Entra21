package ProgramOOP.Base.Abstracao.Exercicios.AbstratoVeiculo;

public class Bicicleta extends Veiculo {
    public Bicicleta(String modelo) {
        super(modelo);
    }

    @Override
    public void mover() {
        System.out.println("Este veículo, é movido de forma manual com pedais!");
    }


    //private String moverV;

    /*public Bicicleta(String modelo) {
        super(modelo);
    }

    @Override
    public void mover() {
        System.out.println("Este veículo, é movido de forma manual com pedais!");
    }*/
}
