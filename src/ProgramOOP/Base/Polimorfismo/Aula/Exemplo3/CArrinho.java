package ProgramOOP.Base.Polimorfismo.Aula.Exemplo3;

public class CArrinho {
    private double valoCompra;

    public CArrinho(double valoCompra) {
        this.valoCompra = valoCompra;
    }

    public void realizarCompra(MetodoPagto metodoPagto) {
        metodoPagto.pagarAVista();
        System.out.println("Compra realizada com Sucesso!");
    }
}
