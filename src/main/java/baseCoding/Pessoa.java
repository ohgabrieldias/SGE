package baseCoding;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String dataNasc;
    private String cpf;
    private String endereco;

    public Pessoa(String nome, String sobrenome, String dataNasc, String cpf, String endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDataNasc() {
        return this.dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String toString() {
        return "{" + "nome =" + getNome() + " " + ",CPF =" + " " + getCpf() + " " + ", endereco =" + getEndereco()
                + "}";
    }
}
