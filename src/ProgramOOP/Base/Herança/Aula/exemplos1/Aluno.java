package ProgramOOP.Base.Herança.Aula.exemplos1;

public class Aluno extends Pessoa{
    private String matricula;

    public Aluno(int idade, String nome, String matricula) {
        super(idade, nome);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void apresentar(){
        System.out.println("Meu nome é: " + super.getNome());
    }
}
