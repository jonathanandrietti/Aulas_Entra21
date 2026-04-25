package ProgramOOP.Base.Encapsulamento.exemplo3;

public class Estudante {
    private String matricula;
    private double[] notas;

    public Estudante(String matricula) {
        this.matricula = matricula;
        this.notas = new double[4];
    }

    public Estudante(String matricula, int nrNotas) {
        this.matricula = matricula;
        this.notas = new double[nrNotas];
    }

    public void adicionarNota(int posicao, double nota) {
        if (posicao < notas.length && posicao >= 0) {
            if (nota >= 0 && nota <= 10) {
                this.notas[posicao] = nota;
            }
        }
    }
    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.length;
    }
}

