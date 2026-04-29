package ProgramOOP.Base.Herança.Aula.exemplos1;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(18, "Jonathan");
        Aluno aluno = new Aluno(18, "Rafael", "1354564313216584131");

        aluno.apresentar();

        System.out.println("Nome aluno: " + aluno.getNome());
        System.out.println("Idade aluno: " + aluno.getIdade());
        System.out.println("Matricula aluno: " + aluno.getMatricula());
    }
}
