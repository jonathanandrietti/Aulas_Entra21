package ProgramOOP.Base.Encapsulamento.Exercicios.Exercicio2;

//Exercício 2: Setter Simples

/* Crie uma classe Carro com atributos privados marca e modelo . Implemente getters
e setters públicos para ambos. O construtor deve inicializar esses atributos. */

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidade;

    // Construtor
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0; // Inicializa com velocidade 0
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public int getVelocidade() {
        return velocidade;
    }

    // Setters com validação
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        if (ano > 1886) { // Primeiro carro foi em 1886
            this.ano = ano;
        } else {
            System.out.println("Erro: Ano inválido.");
        }
    }

    public void setVelocidade(int velocidade) {
        if (velocidade >= 0) {
            this.velocidade = velocidade;
        } else {
            System.out.println("Erro: Velocidade não pode ser negativa.");
        }
    }

    // Método para acelerar
    public void acelerar(int incremento) {
        velocidade += incremento;
    }

    // Método para freiar
    public void freiar(int decremento) {
        velocidade -= decremento;
        if (velocidade < 0) {
            velocidade = 0; // Não permite velocidade negativa
        }
    }

    // Método para verificar se o carro está em movimento
    public boolean estaEmMovimento() {
        return velocidade > 0;
    }

    // Método para calcular a idade do carro (assumindo 2023 como ano atual)
    public int getIdade() {
        return 2023 - ano;
    }
}
