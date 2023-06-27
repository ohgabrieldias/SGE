package baseCoding;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.LinkedList;
import java.util.logging.Logger;
import baseCoding.*;
import sge.MySQLConnector;

public class Turma {
    private LinkedList<Professor> professores; // lista dos professores dessa turma
    private LinkedList<Aluno> alunos; // lista dos alunos
    private LinkedList<String> disciplinas; // lista das disciplinas
    private String curso;
    private String nome; // nome da turma ex: ec11
    private String codigo; // ec11-001
    private Date dataInicio;
    private Date dataFim;

    MySQLConnector connector = new MySQLConnector();
    private static final Logger logger = Logger.getLogger(Turma.class.getName());

    public Turma(Curso curso, String nome, String codigo, Date dataInicio, Date dataFim) {
        this.curso = curso.getCurso();
        this.nome = nome;
        this.codigo = codigo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        
        this.professores = new LinkedList<>();
        this.alunos = new LinkedList<>();
        this.disciplinas = new LinkedList<>();
    }

    public boolean cadastrarTurma(Turma turma) {
        // Insert data into the "turmas" table
        String query = "INSERT INTO turmas (curso, nome, codigo, data_inicio, data_fim) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = connector.getConnection().prepareStatement(query)) {
            stmt.setString(1, turma.getCurso());
            stmt.setString(2, turma.getNome());
            stmt.setString(3, turma.getCodigo());
            stmt.setDate(4, new java.sql.Date(turma.getDataInicio().getTime()));
            stmt.setDate(5, new java.sql.Date(turma.getDataFim().getTime()));
            stmt.executeUpdate();
            logger.info("Turma data inserted successfully into the 'turmas' table.");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return true;
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

    public LinkedList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(LinkedList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public LinkedList<String> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(LinkedList<String> disciplinas) {
        this.disciplinas = disciplinas;
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

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }
    
    public static void main(String[] args) {
    }
}