package ProgramOOP.Base.Abstracao.Exercicios.AbstratoVeiculo;

public class Windsurf extends Veiculo{
    //private String moverV;

    public Windsurf(String modelo) {
        super(modelo);
    }

    @Override
    public void mover() {
        System.out.println("Este veículo é movido pelo Vento em Alto Mar!");
    }
}
