package ProgramOOP.Base.Herança.Aula.Exemplo3;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Bonequinho de Brinquedo");
        produto.setPreco(100d);

        produto.exibirInformacoes();

        System.out.println("+++++++++++++++++++++++++++++++++++++");

        Livro livro = new Livro();
        livro.setNome("E não sobrou ninguém");
        livro.setPreco(59.90d);
        livro.setAutor("Faltou Finalizar");

    }
}
