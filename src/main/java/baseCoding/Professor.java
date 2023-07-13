package baseCoding;

public class Professor extends Pessoa {
    private int id;
    
    public Professor(String nome, String sobrenome, String dataNasc, String cpf, String endereco){
        super(nome, sobrenome, dataNasc, cpf, endereco);
    }
    
    public Professor(int id, String nome, String sobrenome, String dataNasc, String cpf, String end){
        super(nome, sobrenome, dataNasc, cpf, end);
        this.id = id;
    }
    
    public Professor(int id, String nome, String cpf){
        super(nome,  cpf);
        this.id = id;
    }

    public int getId(){
        return this.id;
    }
}
