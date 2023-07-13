package baseCoding;

import java.util.LinkedList;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.List;
import sge.MySQLConnector;

public class Turma {
    private LinkedList<Professor> professores = null; // lista dos professores dessa turma
    private List<Aluno> alunos = null; // lista dos alunos
    private List<Disciplina> disciplinas = null; // lista das disciplinas
    private String curso;
    private int id;
    private String nome; // nome da turma ex: ec11
    private String codigo; // ec11-001
    private String dataInicio;
    private String dataFim;

    MySQLConnector connector = new MySQLConnector();
    private static final Logger logger = Logger.getLogger(Turma.class.getName());

    public Turma(String nome, String codigo, String dataInicio, String dataFim, List<Aluno> listAluno,
            List<Disciplina> listDiscip) {
        this.nome = nome;
        this.codigo = codigo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;

        this.professores = new LinkedList<>();
        this.alunos = listAluno;
        this.disciplinas = listDiscip;
    }

    public Turma(int id, String nome, List<Aluno> listAluno, List<Disciplina> listDiscip) {
        this.nome = nome;
        this.professores = new LinkedList<>();
        this.alunos = listAluno;
        this.disciplinas = listDiscip;
        this.id = id;
    }

    public Turma(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Turma(String nome) {
        this.nome = nome;
    }

    public List<Integer> getListaIdAlunos() {
        // Implementação do método getListaIdAlunos
        List<Integer> listaIdAlunos = new ArrayList<>();
        for (Aluno aluno : alunos) {
            listaIdAlunos.add(aluno.getId());
        }

        return listaIdAlunos;
    }

    public List<Integer> getListaIdsDisciplinas() {
        // Implementação do método getListaIdsDisciplinas
        List<Integer> listaIdsDisciplinas = new ArrayList<>();
        for (Disciplina disciplina : disciplinas) {
            listaIdsDisciplinas.add(disciplina.getId());
        }

        return listaIdsDisciplinas;
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void addProfessor(Professor professor) {
        professores.add(professor);
    }

    // Getters e setters

    public LinkedList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(LinkedList<Professor> professores) {
        this.professores = professores;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setAlunos(LinkedList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public int getId() {
        return id;
    }

}