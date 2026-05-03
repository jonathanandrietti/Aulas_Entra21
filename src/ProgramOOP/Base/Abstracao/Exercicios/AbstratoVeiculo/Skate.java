package ProgramOOP.Base.Abstracao.Exercicios.AbstratoVeiculo;

public class Skate extends Veiculo{
    //private String moverV;

    public Skate(String modelo) {
        super(modelo);
    }

    @Override
    public void mover() {
        System.out.println("Este veículo é movido manualmente com os pés, conhecido como Remada!");
    }
}
