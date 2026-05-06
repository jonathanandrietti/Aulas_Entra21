// MissaoExploracao.java
package Trabalho_Ian_Jonathan;

public class MissaoExploracao extends Missao {
    private String destino;

    public MissaoExploracao(String nome, String objetivo, String dataLancamento, String status, String destino) {
        super(nome, objetivo, dataLancamento, status);
        this.destino = destino;
    }

    @Override
    public void executar() {
        System.out.println("Executando missão de exploração para " + destino);
    }
}
