package org.sge.base;

import java.util.Date;

public class Funcionario extends Pessoa {
    private Date data;
    private String setor;
    private String cargo;
    private float salario;
    private int id;
    private String username;
    private String password;

    public Funcionario(String nome, String sobrenome, String dataNasc, String cpf, String endereco, String username,
            String password) {
        super(nome, sobrenome, dataNasc, cpf, endereco);
        this.username = username;
        this.password = password;
    }

    public Funcionario(int id, String nome, String sobrenome, String dataNasc, String cpf, String end, String username,
            String password) {
        super(nome, sobrenome, dataNasc, cpf, end);
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Funcionario(int id, String nome, String cpf) {
        super(nome, cpf);
        this.id = id;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public Date getDate() {
        return this.data;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassowrd(String password) {
        this.password = password;
    }
}
