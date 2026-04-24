package ProgramOOP.Base.exemplo1;

public class Carro {
    String cor;
    String modelo;
    String marca;
    int ano;
    Pessoa dono;

    public void Ligar(){
        if (dono == null){
            System.out.println("Carro livre de Dono algum!");
        } else {
            dono.apresentar();
            System.out.println("Marca Carro: " + this.marca + " | Modelo: " + this.modelo + " | Cor: " + this.cor +
                    " Ano: " + this.ano);
            System.out.println("Vruuuuuuuuuuuuuuummmmmmmmmmm cof cof cof.... Bam!");
        }
    }
}
