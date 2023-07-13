package baseCoding;

public class Aluno extends Pessoa {
    private int id;
    private long matricula;
    private String responsavel;
    private String cpfresp;
    private static final String SOBRENOME = "sobrenome";  // Compliant

    public Aluno(String nome, String sobrenome, String dataNasc, String cpf, String end, String resp, String cpfresp, long matricula) {
        super(nome, sobrenome, dataNasc, cpf, end);
        this.matricula = matricula;
        this.responsavel = resp;
        this.cpfresp = cpfresp;
    }
    
    public Aluno(int id, String nome, String sobrenome, String dataNasc, String cpf, String end){
        super(nome, sobrenome, dataNasc, cpf, end);
        this.id = id;
    }

    public Aluno(int id, String nome, String cpf) {
        super(nome,cpf);
        this.id = id;
    }
    // Getters and setters for the 'matricula' attribute

    public long getMatricula() {
        return matricula;
    }
    
    public int getId() {
        return id;
    }

    public String getEnd() {
        return super.getEndereco();
    }
    
    public String getResponsavel() {
        return responsavel;
    }
    
    public String getCpfResp() {
        return cpfresp;
    }
        
}