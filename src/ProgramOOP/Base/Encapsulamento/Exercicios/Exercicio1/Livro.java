package ProgramOOP.Base.Encapsulamento.Exercicios.Exercicio1;

//Exercício 1: Classe Simples com Atributos Privados

/* Crie uma classe Livro com os atributos privados titulo e autor . Implemente
getters publicos para ambos os atributos. O construtor deve receber esses dois
parâmetros. */

public class Livro {
    // Atributos privados
    private String titulo;
    private String autor;
    private int paginas;

    // Construtor que inicializa os atributos
    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // Getters públicos
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    // Setters públicos com validação
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPaginas(int paginas) {
        if (paginas >= 0) {
            this.paginas = paginas;
        } else {
            System.out.println("Erro: Páginas não podem ser negativas");
        }
    }

    public boolean ehLongo() {
        return paginas >= 300;
    }
}
