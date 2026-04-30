package ProgramOOP.Base.Polimorfismo.Aula.Exemplo3;

public class Boleto extends MetodoPagto{
    @Override
    public void pagarAVista() {
        System.out.println("Pagando com Boleto");
    }
}
