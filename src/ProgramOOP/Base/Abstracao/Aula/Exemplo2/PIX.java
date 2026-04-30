package ProgramOOP.Base.Abstracao.Aula.Exemplo2;

public class PIX extends Pagamento {

    public PIX(double valor) {
        super(valor);
    }

    @Override
    public void processar() {
        System.out.println("Pagamento com PIX!");
    }
}
