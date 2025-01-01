package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {

    // Criar o objeto
    @Test
    public void NormalTaskObject() throws Exception {

        //arrange
        Organization organization1 = new Organization("ISEP");
        Project project1= new Project("DevSoft","Sprint",3000,"Em progresso",organization1);
        Employee employee1 = new Employee("João", "Professor",500.50);


        //act + assert
        Task task1 = new Task("Fazer Trabalho","Em Progresso",project1,employee1);

    }

    // Illegal Arguments Cosntrutor
    @Test
    public void DontCreateTaskObjectDueToNullName() throws Exception {

        //arrange
        Organization organization1 = new Organization("ISEP");
        Project project1= new Project("DevSoft","Sprint",3000,"Em progresso",organization1);
        Employee employee1 = new Employee("João", "Professor",500.50);


        //act + assert
        assertThrows(Exception.class, () -> new Task(null,"Em Progresso",project1,employee1));

    }

    // Illegal Arguments Cosntrutor
    @Test
    public void DontCreateTaskObjectDueToBlankName() throws Exception {

        //arrange
        Organization organization1 = new Organization("ISEP");
        Project project1= new Project("DevSoft","Sprint",3000,"Em progresso",organization1);
        Employee employee1 = new Employee("João", "Professor",500.50);


        //act + assert
        assertThrows(Exception.class, () -> new Task("","Em Progresso",project1,employee1));

    }

    // Illegal Arguments Cosntrutor
    @Test
    public void DontCreateTaskObjectDueToNullStatus() throws Exception {

        //arrange
        Organization organization1 = new Organization("ISEP");
        Project project1= new Project("DevSoft","Sprint",3000,"Em progresso",organization1);
        Employee employee1 = new Employee("João", "Professor",500.50);


        //act + assert
        assertThrows(Exception.class, () -> new Task("Fazer Trabalho",null,project1,employee1));

    }

    // Illegal Arguments Cosntrutor
    @Test
    public void DontCreateTaskObjectDueToBlankStatus() throws Exception {

        //arrange
        Organization organization1 = new Organization("ISEP");
        Project project1= new Project("DevSoft","Sprint",3000,"Em progresso",organization1);
        Employee employee1 = new Employee("João", "Professor",500.50);


        //act + assert
        assertThrows(Exception.class, () -> new Task("Fazer Trabalho","",project1,employee1));

    }

    // Illegal Arguments Cosntrutor
    @Test
    public void DontCreateTaskObjectDueToNullProject() throws Exception {

        //arrange
        Employee employee1 = new Employee("João", "Professor",500.50);


        //act + assert
        assertThrows(Exception.class, () -> new Task("Fazer Trabalho","Em Progresso",null,employee1));

    }

    // Illegal Arguments Cosntrutor
    @Test
    public void DontCreateTaskObjectDueToNullEmployee() throws Exception {

        //arrange
        Organization organization1 = new Organization("ISEP");
        Project project1= new Project("DevSoft","Sprint",3000,"Em progresso",organization1);


        //act + assert
        assertThrows(Exception.class, () -> new Task("Fazer Trabalho","Em Progresso",project1,null));

    }

    // change Employee
    @Test
    public void changeEmployee() throws Exception{
        //arrange
        Organization organization1 = new Organization("ISEP");
        Project project1= new Project("DevSoft","Sprint",3000,"Em progresso",organization1);
        Employee employee1 = new Employee("João", "Professor",500.50);
        Task task1 = new Task("Fazer Trabalho","Em Progresso",project1,employee1);

        // act
        Boolean result = task1.changeEmployeeTask(employee1);

        //Assert
        assertTrue(result);

    }

    // change Employee
    @Test
    public void NullDontchangeEmployee() throws Exception{
        //arrange
        Organization organization1 = new Organization("ISEP");
        Project project1= new Project("DevSoft","Sprint",3000,"Em progresso",organization1);
        Employee employee1 = new Employee("João", "Professor",500.50);
        Task task1 = new Task("Fazer Trabalho","Em Progresso",project1,employee1);

        // act
        Boolean result = task1.changeEmployeeTask(null);

        //Assert
        assertFalse(result);

    }

    // change Employee
    @Test
    public void changeStatus() throws Exception{
        //arrange
        Organization organization1 = new Organization("ISEP");
        Project project1= new Project("DevSoft","Sprint",3000,"Em progresso",organization1);
        Employee employee1 = new Employee("João", "Professor",500.50);
        Task task1 = new Task("Fazer Trabalho","Em Progresso",project1,employee1);

        // act
        task1.changeStatus("Concluido");

        //Assert
        assertEquals("Concluido", task1.get_status() );

    }

}