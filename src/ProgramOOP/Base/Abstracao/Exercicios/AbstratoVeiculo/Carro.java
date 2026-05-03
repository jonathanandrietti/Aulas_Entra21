package ProgramOOP.Base.Abstracao.Exercicios.AbstratoVeiculo;

public class Carro extends Veiculo {
    //private String moverV;

    public Carro(String modelo) {
        super(modelo);
    }


    @Override
    public void mover() {
        System.out.println("Este veículo é movido por: ");
        System.out.println("Gasolina, Alcool, Diesel, GNV ou Elétrico!");
    }
}
