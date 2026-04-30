package ProgramOOP.Base.Abstracao.Aula.Exemplo1.Interfacee;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(3);
        Retangulo retangulo = new Retangulo(4,6);

        System. out.println("A area do circulo é " + circulo.calcularArea());
        System.out.println("A area do retangulo é " + retangulo.calcularArea());

        IFormaGeometrica interfaceFormaGeometrica = new Circulo( 2);
        interfaceFormaGeometrica.calcularArea();
    }
}
