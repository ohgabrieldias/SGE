package baseCoding;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest {
    @Test   
    public void testGetSetor(){
        // Arrange
        String setor = "Financeiro";
        Funcionario funcionario = new Funcionario(1, "Maria", "Souza", "02/02/2001", "0987654321", "Rua B", "maria", "123456");
        funcionario.setSetor(setor);

        // Act
        String result = funcionario.getSetor();

        // Assert
        assertEquals(setor, result, "Setor não corresponde");
    }

    @Test
    public void testSetSetor(){
        // Arrange
        String setor = "Financeiro";
        Funcionario funcionario = new Funcionario(1, "Maria", "Souza", "02/02/2001", "0987654321", "Rua B", "maria", "123456");

        // Act
        funcionario.setSetor(setor);

        // Assert
        assertEquals(setor, funcionario.getSetor(), "Setor não corresponde");
    }

    @Test
    public void testGetCargo(){
        // Arrange
        String cargo = "Gerente";
        Funcionario funcionario = new Funcionario(1, "Maria", "Souza", "02/02/2001", "0987654321", "Rua B", "maria", "123456");
        funcionario.setCargo(cargo);

        // Act
        String result = funcionario.getCargo();

        // Assert
        assertEquals(cargo, result, "Cargo não corresponde");
    }

    // @Test
    // public void testGetDate(){
    //     // Arrange
    //     String data = "02/02/2001";
    //     Funcionario funcionario = new Funcionario(1, "Maria", "Souza", data, "0987654321", "Rua B", "maria", "123456");

    //     // Act
    //     String result = funcionario.getDate();

    //     // Assert
    //     assertEquals(data, result, "Data não corresponde");
    // }

    @Test
    public void testGetId(){
        // Arrange
        int id = 1;
        Funcionario funcionario = new Funcionario(id, "Maria", "Souza", "02/02/2001", "0987654321", "Rua B", "maria", "123456");

        // Act
        int result = funcionario.getId();

        // Assert
        assertEquals(id, result, "ID não corresponde");
    }

    @Test
    public void testGetUserName(){
        // Arrange
        String username = "maria";
        Funcionario funcionario = new Funcionario(1, "Maria", "Souza", "02/02/2001", "0987654321", "Rua B", username, "123456");

        // Act
        String result = funcionario.getUsername();

        // Assert
        assertEquals(username, result, "Username não corresponde");
    }

    @Test
    public void testSetUserName(){
        // Arrange
        String username = "maria";
        Funcionario funcionario = new Funcionario(1, "Maria", "Souza", "02/02/2001", "0987654321", "Rua B", username, "123456");

        // Act
        funcionario.setUsername(username);

        // Assert
        assertEquals(username, funcionario.getUsername(), "Username não corresponde");
    }

    // @Test
    // public void testSetPassoword(){ 
        
    // }
}
