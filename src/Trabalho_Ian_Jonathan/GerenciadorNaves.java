package Trabalho_Ian_Jonathan;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorNaves {
    private List<NaveEspacial> naves = new ArrayList<>();
    private int proximoIdNave = 1;

    public void adicionarNave(String nome, String tipo, String capacidade) {
        try {
            int capacidadeNumerica = Integer.parseInt(capacidade);
            if (capacidadeNumerica <= 0) {
                throw new IllegalArgumentException("Capacidade deve ser um número positivo");
            }
            naves.add(new NaveEspacial(
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

    public NaveEspacial buscarNave(String idNave) {
        for (NaveEspacial nave : naves) {
            if (nave.getId().equals(idNave)) {
                return nave;
            }
        }
        return null;
    }

    public List<NaveEspacial> getNaves() {
        return naves;
    }

    public void listarNaves() {
        System.out.println("\n--- Lista de Naves ---");
        if (naves.isEmpty()) {
            System.out.println("Nenhuma nave cadastrada.");
            return;
        }

        for (NaveEspacial nave : naves) {
            System.out.println("ID: " + nave.getId() +
                    " | Nome: " + nave.getNome() +
                    " | Tipo: " + nave.getTipo() +
                    " | Capacidade: " + nave.getCapacidade());
        }
    }
}
