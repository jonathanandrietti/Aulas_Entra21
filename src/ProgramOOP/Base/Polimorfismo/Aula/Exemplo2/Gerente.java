package ProgramOOP.Base.Polimorfismo.Aula.Exemplo2;

public class Gerente extends Funcionario{
    @Override
    public double calcularPagamento() {
        return super.getSalarioBase() + 1000d; //d = Double, f = Float
    }
}
