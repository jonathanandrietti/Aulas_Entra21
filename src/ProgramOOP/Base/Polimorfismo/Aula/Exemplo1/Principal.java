package ProgramOOP.Base.Polimorfismo.Aula.Exemplo1;

public class Principal {
    public static void main(String[] args) {
        Animal animalGenerico = new Animal();
        Animal rex = new Cachorro();
        Animal Puritana = new Gato();

        animalGenerico.emitirSom();
        rex.emitirSom();
        Puritana.emitirSom();

        Cachorro cachorro = new Cachorro();
        cachorro.perseguirCarteiro();
    }
}
