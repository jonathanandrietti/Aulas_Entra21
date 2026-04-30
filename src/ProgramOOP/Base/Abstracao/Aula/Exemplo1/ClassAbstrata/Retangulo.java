package ProgramOOP.Base.Abstracao.Aula.Exemplo1.ClassAbstrata;

public class Retangulo extends FormaGeometricaAbstract {
    private double altura;
    private double largura;

    public Retangulo (double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    double calcularArea() {
        return altura * largura;
    }
}
