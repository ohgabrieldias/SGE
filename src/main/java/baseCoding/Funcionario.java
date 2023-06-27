/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseCoding;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;
import sge.MySQLConnector;

/**
 *
 * @author Gabriel
 */
public class Funcionario extends Pessoa {
    private String setor;
    private String cargo;
    private float salario;
    
    public Funcionario(String nome, String sobrenome, String dataNasc, String cpf, String endereco){
        super(nome, sobrenome, dataNasc, cpf, endereco);
    }
    
    private static final Logger logger = Logger.getLogger(Funcionario.class.getName());


    MySQLConnector connector = new MySQLConnector();

    public boolean cadastrarFuncionario(Funcionario funcionario) {
    // Insert data into the "funcionarios" table
    String query = "INSERT INTO funcionarios (nome, sobrenome, datanasc, cpf, endereco, setor, cargo, salario) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

    try (PreparedStatement stmt = connector.getConnection().prepareStatement(query)) {
        stmt.setString(1, funcionario.getNome());
        stmt.setString(2, funcionario.getSobrenome());
        stmt.setString(3, funcionario.getDataNasc());
        stmt.setString(4, funcionario.getCpf());
        stmt.setString(5, funcionario.getEndereco());
        stmt.setString(6, funcionario.getSetor());
        stmt.setString(7, funcionario.getCargo());
        stmt.setFloat(8, funcionario.getSalario());
        stmt.executeUpdate();
        logger.info("Funcionario data inserted successfully into the 'funcionarios' table.");

    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    return true;
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

public void setCargo(String cargo) {
    this.cargo = cargo;
}

public float getSalario() {
    return salario;
}

public void setSalario(float salario) {
    this.salario = salario;
}

}
