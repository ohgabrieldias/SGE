/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseCoding;

/**
 *
 * @author Matheus
 */
public class Pessoa {
    private String nome;
    private String sobrenome;
    private String dataNasc;
    private String cpf;
    private String endereco;

public Pessoa(String nome, String sobrenome, String dataNasc, String cpf, String endereco){
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

public String getNome(){
  return this.nome;
}

public String getSobrenome() {
    return this.sobrenome;
}

public String getDataNasc() {
    return this.dataNasc;
}

public String getCpf(){
    return this.cpf;
}

public String getEndereco(){
    return this.endereco;
}

public String toString(){
    return "{" + "nome =" +getNome() + " " + ",CPF =" + " " + getCpf() + " " + ", endereco =" + getEndereco() + "}"; 
  }
}

