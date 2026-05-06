// MissaoResgate.java
package Trabalho_Ian_Jonathan;

public class MissaoResgate extends Missao {
    private String naveResgatada;

    public MissaoResgate(String nome, String objetivo, String dataLancamento, String status, String naveResgatada) {
        super(nome, objetivo, dataLancamento, status);
        this.naveResgatada = naveResgatada;
    }

    @Override
    public void executar() {
        System.out.println("Executando missão de resgate da nave " + naveResgatada);
    }
}