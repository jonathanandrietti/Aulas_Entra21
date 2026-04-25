package ProgramOOP.Base.Encapsulamento.Exercicios.Exercicio1;

public class mainLivro {
    public static void main(String[] args) {
        // Criando dois objetos Livro
        Livro livro1 = new Livro("Java Básico", "João Silva", 250);
        Livro livro2 = new Livro("Java Avançado", "Maria Souza", 400);

        // Exibindo informações do primeiro livro
        System.out.println("Livro 1:");
        System.out.println("Título: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Páginas: " + livro1.getPaginas());
        if (livro1.ehLongo()) {
            System.out.println("Este livro é extenso! ");
        } else {
            System.out.println("Este livro é curto!");
        }

        System.out.println();

        // Exibindo informações do segundo livro
        System.out.println("Livro 2:");
        System.out.println("Título: " + livro2.getTitulo());
        System.out.println("Autor: " + livro2.getAutor());
        System.out.println("Páginas: " + livro2.getPaginas());
        if (livro2.ehLongo()) {
            System.out.println("Este livro é extenso! ");
        } else {
            System.out.println("Este livro é curto!");
        }
    }
}
