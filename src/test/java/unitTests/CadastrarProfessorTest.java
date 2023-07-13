package unitTests;

import DAO.ProfessorDAO;
import baseCoding.Professor;

public class CadastrarProfessorTest {
    public static void main(String[] args) {
        ProfessorDAO professorDao = new ProfessorDAO();
        // Create a new student
        Professor professor = new Professor("João", "Silva", "19/06/2023", "98765432109", "Av n sei onde");

        // Insert the student into the database for testing
        professorDao.cadastrarProfessor(professor);
    }
}
