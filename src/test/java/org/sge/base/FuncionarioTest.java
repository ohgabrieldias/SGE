package org.sge.base;

import org.sge.base.Funcionario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FuncionarioTest {
    @Test   
    public void testGetSetor() {
        String setor = "Financeiro";
        Funcionario funcionario = new Funcionario(1, "Maria", "Souza", "02/02/2001", "0987654321", "Rua B", "maria", "123456");
        funcionario.setSetor(setor);
        String result = funcionario.getSetor();
        assertEquals(setor, result, "Setor não corresponde");
    }

    @Test
    public void testSetSetor() {
        String setor = "Financeiro";
        Funcionario funcionario = new Funcionario(1, "Maria", "Souza", "02/02/2001", "0987654321", "Rua B", "maria", "123456");
        funcionario.setSetor(setor);
        assertEquals(setor, funcionario.getSetor(), "Setor não corresponde");
    }

    @Test
    public void testGetCargo() {
        String cargo = "Gerente";
        Funcionario funcionario = new Funcionario(1, "Maria", "Souza", "02/02/2001", "0987654321", "Rua B", "maria", "123456");
        funcionario.setCargo(cargo);
        String result = funcionario.getCargo();
        assertEquals(cargo, result, "Cargo não corresponde");
    }

    // @Test
    // public void testGetDate() {
    //     String data = "02/02/2001";
    //     Funcionario funcionario = new Funcionario(1, "Maria", "Souza", data, "0987654321", "Rua B", "maria", "123456");
    //     String result = funcionario.getDate();
    //     assertEquals(data, result, "Data não corresponde");
    // }

    @Test
    public void testGetId() {
        int id = 1;
        Funcionario funcionario = new Funcionario(id, "Maria", "Souza", "02/02/2001", "0987654321", "Rua B", "maria", "123456");
        int result = funcionario.getId();
        assertEquals(id, result, "ID não corresponde");
    }

    @Test
    public void testGetUserName() {
        String username = "maria";
        Funcionario funcionario = new Funcionario(1, "Maria", "Souza", "02/02/2001", "0987654321", "Rua B", username, "123456");
        String result = funcionario.getUsername();
        assertEquals(username, result, "Username não corresponde");
    }

    @Test
    public void testSetUserName() {
        String username = "maria";
        Funcionario funcionario = new Funcionario(1, "Maria", "Souza", "02/02/2001", "0987654321", "Rua B", username, "123456");
        funcionario.setUsername(username);
        assertEquals(username, funcionario.getUsername(), "Username não corresponde");
    }

    // @Test
    // public void testSetPassword() {
    //     String password = "senha123";
    //     Funcionario funcionario = new Funcionario(1, "Maria", "Souza", "02/02/2001", "0987654321", "Rua B", "maria", "123456");
    //     funcionario.setPassword(password);
    //     assertEquals(password, funcionario.getPassword(), "Senha não corresponde");
    // }
}

