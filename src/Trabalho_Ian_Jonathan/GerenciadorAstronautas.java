package Trabalho_Ian_Jonathan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GerenciadorAstronautas {
    private List<Astronauta> astronautas = new ArrayList<>();
    private Map<String, Astronauta> mapaAstronautas = new HashMap<>();
    private int proximoIdAstronauta = 1;

    public void adicionarAstronauta(String nome, String especialidade) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do astronauta não pode ser vazio");
        }
        if (especialidade == null || especialidade.trim().isEmpty()) {
            throw new IllegalArgumentException("Especialidade do astronauta não pode ser vazio");
        }

        astronautas.add(new Astronauta(
                String.valueOf(proximoIdAstronauta++),
                nome.trim(),
                especialidade.trim()
        ));
        atualizarMapaAstronautas();
        System.out.println("Astronauta " + nome + " adicionado com sucesso!");
    }

    public Astronauta buscarAstronauta(String id) {
        return mapaAstronautas.get(id);
    }

    private void atualizarMapaAstronautas() {
        mapaAstronautas.clear();
        for (Astronauta astronauta : astronautas) {
            mapaAstronautas.put(astronauta.getId(), astronauta);
        }
    }

    public void listarAstronautas() {
        System.out.println("\n--- Lista de Astronautas ---");
        if (astronautas.isEmpty()) {
            System.out.println("Nenhum astronauta cadastrado.");
            return;
        }

        for (Astronauta astronauta : astronautas) {
            System.out.println("ID: " + astronauta.getId() +
                    " | Nome: " + astronauta.getNome() +
                    " | Especialidade: " + astronauta.getEspecialidade());
        }
    }
}
