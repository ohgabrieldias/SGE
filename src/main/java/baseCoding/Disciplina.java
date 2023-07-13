package baseCoding;

import java.util.logging.Logger;
import sge.MySQLConnector;

public class Disciplina {
    private int id;
    private String nome;
    private String dataInicio;
    private String dataFim;
    private String professor;

    public Disciplina(String nome, String dataInicio, String dataFim, String professor) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.professor = professor;
    }

    public Disciplina(int id, String nome, String dataInicio, String dataFim, String professor) {
        this.id = id;
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.professor = professor;
    }

    public Disciplina(int id, String nome) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public int getId() {
        return this.id;
    }

    public String getNomeProfessor() {
        return this.professor;
    }

    public String getDataInicio() {
        return this.dataInicio;
    }

    public String getDataFim() {
        return this.dataFim;
    }

}
