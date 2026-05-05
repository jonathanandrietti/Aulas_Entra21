package Trabalho_Ian_Jonathan;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorMissoes {
    private List<Missao> missoes = new ArrayList<>();
    private int proximoIdMissao = 1;

    public void adicionarMissao(String nome, String objetivo, String dataLancamento, String status) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome da missão não pode ser vazio");
        }
        if (objetivo == null || objetivo.trim().isEmpty()) {
            throw new IllegalArgumentException("Objetivo da missão não pode ser vazio");
        }
        if (dataLancamento == null || dataLancamento.trim().isEmpty()) {
            throw new IllegalArgumentException("Data de lançamento não pode ser vazia");
        }
        if (!status.equals("Planejada") && !status.equals("Em Andamento") &&
                !status.equals("Concluída") && !status.equals("Cancelada")) {
            throw new IllegalArgumentException("Status inválido");
        }

        missoes.add(new Missao(
                String.valueOf(proximoIdMissao++),
                nome.trim(),
                objetivo.trim(),
                dataLancamento.trim(),
                status
        ));
        System.out.println("Missão " + nome + " adicionada com sucesso!");
    }

    public void listarMissoes() {
        System.out.println("\n--- Lista de Missões ---");
        if (missoes.isEmpty()) {
            System.out.println("Nenhuma missão cadastrada.");
            return;
        }

        for (Missao missao : missoes) {
            System.out.println("ID: " + missao.getId() +
                    " | Nome: " + missao.getNome() +
                    " | Status: " + missao.getStatus() +
                    " | Nave: " + missao.getIdNave() +
                    " | Astronautas: " + String.join(", ", missao.getIdAstronautas()));
        }
    }

    public void associarNave(String idMissao, String idNave) {
        for (Missao missao : missoes) {
            if (missao.getId().equals(idMissao)) {
                missao.setIdNave(idNave);
                System.out.println("Nave associada com sucesso!");
                return;
            }
        }
        System.out.println("Missão não encontrada.");
    }

    public void associarAstronauta(String idMissao, String idAstronauta) {
        for (Missao missao : missoes) {
            if (missao.getId().equals(idMissao)) {
                missao.adicionarAstronauta(idAstronauta);
                System.out.println("Astronauta associado com sucesso!");
                return;
            }
        }
        System.out.println("Missão não encontrada.");
    }

    public void atualizarStatus(String idMissao, String novoStatus) {
        for (Missao missao : missoes) {
            if (missao.getId().equals(idMissao)) {
                missao.atualizarStatus(novoStatus);
                System.out.println("Status atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Missão não encontrada.");
    }
}
