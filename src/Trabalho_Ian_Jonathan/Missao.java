package Trabalho_Ian_Jonathan;

import java.util.ArrayList;
import java.util.List;

public class Missao {
    private String id;
    private String nome;
    private String objetivo;
    private String dataLancamento;
    private String status;
    private String idNave;
    private List<String> idAstronautas;

    public Missao(String id, String nome, String objetivo, String dataLancamento, String status) {
        this.id = id;
        this.nome = nome;
        this.objetivo = objetivo;
        this.dataLancamento = dataLancamento;
        this.status = status;
        this.idNave = "N/A";
        this.idAstronautas = new ArrayList<>();
    }

    // Getters e Setters
    public String getId() { return id; }
    public String getNome() { return nome; }
    public String getObjetivo() { return objetivo; }
    public String getDataLancamento() { return dataLancamento; }
    public String getStatus() { return status; }
    public String getIdNave() { return idNave; }
    public List<String> getIdAstronautas() { return new ArrayList<>(idAstronautas); }

    public void setIdNave(String idNave) {
        this.idNave = idNave;
    }

    public void adicionarAstronauta(String idAstronauta) {
        idAstronautas.add(idAstronauta);
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }
}
