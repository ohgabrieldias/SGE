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
    private String cpf;
    private String endereco;

public Pessoa(String nome, String cpf, String endereco){
    this.nome = nome;
    this.cpf = cpf;
    this.endereco = endereco;
}

public String getNome(){
  return this.nome;
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

