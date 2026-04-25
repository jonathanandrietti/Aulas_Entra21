package ProgramOOP.Base.Encapsulamento.Exercicios.Exercicio2;

public class mainCarro {
    public static void main(String[] args) {
        // Criando dois carros
        Carro carro1 = new Carro("Toyota", "Corolla", 2015);
        Carro carro2 = new Carro("Ford", "Mustang", 2020);

        // Acelerando e freiando
        carro1.acelerar(50);
        carro2.acelerar(30);
        carro2.freiar(10);

        // Exibindo informações do carro 1
        System.out.println("Carro 1:");
        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Ano: " + carro1.getAno());
        System.out.println("Velocidade: " + carro1.getVelocidade() + " km/h");
        System.out.println("Está em movimento? " + (carro1.estaEmMovimento() ? "Sim" : "Não"));
        System.out.println("Idade: " + carro1.getIdade() + " anos");
        System.out.println();

        // Exibindo informações do carro 2
        System.out.println("Carro 2:");
        System.out.println("Marca: " + carro2.getMarca());
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Ano: " + carro2.getAno());
        System.out.println("Velocidade: " + carro2.getVelocidade() + " km/h");
        System.out.println("Está em movimento? " + (carro2.estaEmMovimento() ? "Sim" : "Não"));
        System.out.println("Idade: " + carro2.getIdade() + " anos");
    }
}
