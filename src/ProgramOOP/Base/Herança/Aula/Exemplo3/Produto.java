package ProgramOOP.Base.Herança.Aula.Exemplo3;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco + "R$" );
    }
}
