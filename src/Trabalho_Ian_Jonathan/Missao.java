package Trabalho_Ian_Jonathan;

import java.util.ArrayList;
import java.util.List;

public abstract class Missao {
    private String id;
    private String nome;
    private String objetivo;
    private String dataLancamento;
    private String status;
    private Nave nave;
    private Astronauta[] astronautas = new Astronauta[5]; // Exemplo com 5 posições

    public Missao(String nome, String objetivo, String dataLancamento, String status) {
        this.id = generateId();
        this.nome = nome;
        this.objetivo = objetivo;
        this.dataLancamento = dataLancamento;
        this.status = status;
        this.astronautas = new Astronauta[5];
    }

    private String generateId() {
        return "M" + System.currentTimeMillis();
    }

    // Método faltante
    public String getNome() {
        return nome;
    }

    public void setNave(Nave nave) {
        this.nave = nave;
    }

    public Nave getNave() {
        return nave;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Astronauta[] getAstronautas() {
        return astronautas;
    }

    public String getId() {
        return id;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public String getStatus() {
        return status;
    }

    public abstract void executar();
}
