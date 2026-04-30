package ProgramOOP.Base.Abstracao.Aula.Exemplo1.ClassAbstrata;

public class Principal {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2);

        Retangulo retangulo = new Retangulo(3,5);

        double areaCirculo = circulo.calcularArea();
        double areaRetangulo = retangulo.calcularArea();

        System.out.println("Área Circulo: " + areaCirculo);
        System.out.println("Área Retangulo: " + areaRetangulo);

        FormaGeometricaAbstract quadrado = new Retangulo( 2, 2);
        System.out.println("Área do quadrado é " + quadrado.calcularArea());
    }
}
