package Trabalho_Ian_Jonathan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GerenciadorMissoes {
    private List<Missao> missoes = new ArrayList<>();
    private Map<String, Missao> mapaMissoes = new HashMap<>();
    private GerenciadorNaves gerenciadorNaves; // Campo adicionado
    private GerenciadorAstronautas gerenciadorAstronautas; // Campo adicionado

    // Construtor para inicializar os gerenciadores
    public GerenciadorMissoes(GerenciadorNaves gerenciadorNaves, GerenciadorAstronautas gerenciadorAstronautas) {
        this.gerenciadorNaves = gerenciadorNaves;
        this.gerenciadorAstronautas = gerenciadorAstronautas;
    }

    public GerenciadorMissoes() {

    }

    public void adicionarMissao(String nomeMissao, String objetivoMissao, String dataLancamento, String statusMissao) {
        adicionarMissao(nomeMissao, objetivoMissao, dataLancamento, statusMissao, "genérica"); // Exemplo com tipo padrão
    }

    public void adicionarMissao(String nome, String objetivo, String dataLancamento, String status, String tipoMissao) {
        try {
            if (tipoMissao.equalsIgnoreCase("exploracao")) {
                missoes.add(new MissaoExploracao(nome, objetivo, dataLancamento, status, "Marte"));
            } else if (tipoMissao.equalsIgnoreCase("resgate")) {
                missoes.add(new MissaoResgate(nome, objetivo, dataLancamento, status, "Nave X"));
            } else {
                missoes.add(new Missao(nome, objetivo, dataLancamento, status) {
                    @Override
                    public void executar() {
                        System.out.println("Executando missão genérica");
                    }
                });
            }
            atualizarMapaMissoes();
        } catch (Exception e) {
            System.err.println("Erro crítico: " + e.getMessage());
            e.printStackTrace(); // Para depuração
        }
    }

    public void associarNave(String idMissao, String idNave) {
        associarNave(idMissao, idNave, gerenciadorNaves); // Usa o campo da classe
    }

    public void associarAstronauta(String idMissao, String idAstronauta) {
        associarAstronauta(idMissao, idAstronauta, gerenciadorAstronautas); // Usa o campo da classe
    }

    public void associarNave(String idMissao, String idNave, GerenciadorNaves gerenciadorNaves) {
        try {
            Missao missao = mapaMissoes.get(idMissao);
            NaveEspacial nave = gerenciadorNaves.buscarNave(idNave);
            if (missao != null && nave != null) {
                missao.setNave(nave);
            } else {
                System.out.println("Missão ou nave não encontrada");
            }
        } catch (Exception e) {
            System.err.println("Erro crítico: " + e.getMessage());
            e.printStackTrace(); // Para depuração
        }
    }

    public void associarAstronauta(String idMissao, String idAstronauta, GerenciadorAstronautas gerenciadorAstronautas) {
        try {
            Missao missao = mapaMissoes.get(idMissao);
            Astronauta astronauta = gerenciadorAstronautas.buscarAstronauta(idAstronauta);
            if (missao != null && astronauta != null) {
                Astronauta[] astronautas = missao.getAstronautas();
                for (int i = 0; i < astronautas.length; i++) {
                    if (astronautas[i] == null) {
                        astronautas[i] = astronauta;
                        break;
                    }
                }
            } else {
                System.out.println("Missão ou astronauta não encontrado");
            }
        } catch (Exception e) {
            System.err.println("Erro crítico: " + e.getMessage());
            e.printStackTrace(); // Para depuração
        }
    }

    public void atualizarStatus(String idMissao, String novoStatus) {
        try {
            Missao missao = mapaMissoes.get(idMissao);
            if (missao != null) {
                missao.setStatus(novoStatus);
            } else {
                System.out.println("Missão não encontrada");
            }
        } catch (Exception e) {
            System.err.println("Erro crítico: " + e.getMessage());
            e.printStackTrace(); // Para depuração
        }
    }

    public void listarMissoes() {
        for (Missao missao : missoes) {
            System.out.println("Missão: " + missao.getNome());
            System.out.println("Objetivo: " + missao.getObjetivo());
            System.out.println("Data: " + missao.getDataLancamento());
            System.out.println("Status: " + missao.getStatus());
            if (missao.getNave() != null) {
                System.out.println("Nave associada: " + missao.getNave().getNome());
            }
            System.out.println("-----------------------------");
        }
    }

    private void atualizarMapaMissoes() {
        mapaMissoes.clear();
        for (Missao missao : missoes) {
            mapaMissoes.put(missao.getId(), missao); // Pode causar NullPointerException
        }
    }

    public Missao buscarMissao(String id) {
        return mapaMissoes.get(id);
    }
}
