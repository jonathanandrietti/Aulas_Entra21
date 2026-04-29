package ProgramOOP.Base.Encapsulamento.Aula.exemplo3;

public class Principal {

    public static void main(String[] args) {
        Estudante estudante = new Estudante("1");
        Estudante estudante1 = new Estudante("1", 2);

        estudante.adicionarNota(0, 10);
        estudante.adicionarNota(1, 10);
        System.out.println(estudante.calcularMedia());
    }
}