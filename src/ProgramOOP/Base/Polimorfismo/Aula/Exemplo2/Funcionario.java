package ProgramOOP.Base.Polimorfismo.Aula.Exemplo2;

public class Funcionario {
    private double salarioBase;

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcularPagamento(){
        return this.salarioBase;
    }
}
