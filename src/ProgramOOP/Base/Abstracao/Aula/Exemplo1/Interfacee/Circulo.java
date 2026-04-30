package ProgramOOP.Base.Abstracao.Aula.Exemplo1.Interfacee;

public class Circulo implements IFormaGeometrica{

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return raio * raio * Math.PI;
    }
}
