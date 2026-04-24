package ProgramOOP.Base.exercicios;

public class ContaBancaria {
    int nConta, nAgencia;
    String nome, cpf;
    double valor;

    public ContaBancaria(int nConta, int nAgencia, String nome, String cpf, double valor){
        this.nConta = nConta;
        this.nAgencia = nAgencia;
        this.nome = nome;
        this.cpf = cpf;
        this.valor = valor;
    }

    void sacar(){
        System.out.println("Numero Conta: " + this.nConta);
        System.out.println("Numero da Agencia: " + this.nAgencia);
        System.out.println("Usuário: " + this.nome);
        System.out.println("Documento: " + this.cpf);
        System.out.println("Saldo Atual: " + this.valor);
    }
}
