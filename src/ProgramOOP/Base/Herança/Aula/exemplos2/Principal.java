package ProgramOOP.Base.Herança.Aula.exemplos2;

public class Principal {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Jonathan", 150_000, 320_000);
        System.out.println("O salário total de " + vendedor.getNome() + " é " + vendedor.getSalarioTotal());
    }
}
