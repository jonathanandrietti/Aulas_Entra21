package ProgramOOP.Base.Encapsulamento.exemplo1;

public class Pessoa {
    private String nome;

    public void setNome(String nome) {
        if (nome == null || nome.length() == 0) {
            System.out.println("Nao existe nome nulo !! ");
        } else {
            this.nome = nome;
        }
    }
        public String getNome () {
            nousages
            return this.nome;
    }

        public void apresentar () {
            nousages
            System.out.println("Meu nome é " + this.nome);
            System.out.println("Meu nome tem " + this.nome.length() + "letras");
    }
}