package ProgramOOP.Base.Abstracao.Exercicios.AbstrataAnimal;

public abstract class AnimalAb {
    public AnimalAb(String emitirSom) {
    }
        //Métodos Obrigatórios:
        public abstract void Animal();
        public abstract void Nome();

        //Métodos Opcipnais
        public void mensagem(){
        System.out.println("Usando ponto não obrigatório!");
    }
}
