package ProgramOOP.Base.Polimorfismo.Aula.Exemplo2;

public class Principal {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente();
        gerente.setSalarioBase(10_000d);

        System.out.println("O salário do Gerente é: " + gerente.calcularPagamento());

        Funcionario funcionario = new Funcionario();
        funcionario.setSalarioBase(3_000d);

        System.out.println("O salário Base do funcionário é: " + funcionario.calcularPagamento());

        Funcionario vendedor = new Vendedor(2000, 3000);
        //vendedor.setSalarioBase(2_000d);
        //vendedor.set
        System.out.println("O salário do vendedor é: " + vendedor.calcularPagamento());
        System.out.println("Comissão paga ao vendedor: " + (vendedor.calcularPagamento() - funcionario.calcularPagamento()));

    }
}
