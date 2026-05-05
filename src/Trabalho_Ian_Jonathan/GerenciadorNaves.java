package Trabalho_Ian_Jonathan;

//import Trabalho_Ian_Jonathan.Nave;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorNaves {
    private List<Nave> naves = new ArrayList<>();
    private int proximoIdNave = 1;

    public void adicionarNave(String nome, String tipo, String capacidade) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome da nave não pode ser vazio");
        }
        if (tipo == null || tipo.trim().isEmpty()) {
            throw new IllegalArgumentException("Tipo da nave não pode ser vazio");
        }
        try {
            int capacidadeNumerica = Integer.parseInt(capacidade);
            if (capacidadeNumerica <= 0) {
                throw new IllegalArgumentException("Capacidade deve ser um número positivo");
            }
            naves.add(new Nave(
                    String.valueOf(proximoIdNave++),
                    nome.trim(),
                    tipo.trim(),
                    capacidadeNumerica
            ));
            System.out.println("Nave " + nome + " adicionada com sucesso!");
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Capacidade deve ser um número válido");
        }
    }

    public List<Nave> getNaves() {
        return naves;
    }

    public void setNaves(List<Nave> naves) {
        this.naves = naves;
    }

    public int getProximoIdNave() {
        return proximoIdNave;
    }

    public void setProximoIdNave(int proximoIdNave) {
        this.proximoIdNave = proximoIdNave;
    }

    public void listarNaves() {
        System.out.println("\n--- Lista de Naves ---");
        if (naves.isEmpty()) {
            System.out.println("Nenhuma nave cadastrada.");
            return;
        }

        for (Nave nave : naves) {
            System.out.println("ID: " + nave.getId() +
                    " | Nome: " + nave.getNome() +
                    " | Tipo: " + nave.getTipo() +
                    " | Capacidade: " + nave.getCapacidade());
        }
    }
}
