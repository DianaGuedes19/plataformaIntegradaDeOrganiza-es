package org.example;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    // Criar o objeto
    @Test
    public void NormalEmployeeObject() throws Exception {

        //arrange
        Department department1 = new Department("Switch");
        Organization organization1 = new Organization("ISEP");
        Employee employee1 = new Employee("João", "Professor",500.50);
        Project project1 = new Project("Isep", "Projeto de ISEP",20000,"Em andamento",organization1);
        Task task1 = new Task("Switch","Em progresso", project1, employee1);

        //act + assert
        Employee ISEP = new Employee("ISEP", "Engenheiro", 2500,task1,department1);

    }

    // Null name
    @Test
    public void nullNameDontCreateAnEmployee() throws Exception {

        //arrange
        Department department1 = new Department("Switch");
        Organization organization1 = new Organization("ISEP");
        Employee employee1 = new Employee("João", "Professor",500.50);
        Project project1 = new Project("Isep", "Projeto de ISEP",20000,"Em andamento",organization1);
        Task task1 = new Task("Switch","Em progresso", project1, employee1);

        //act + assert
        assertThrows(Exception.class, () -> new Employee(null,"Engenheiro", 2500,task1,department1));

    }

    // Blank name
    @Test
    public void BlankNameDontCreateAnEmployee() throws Exception {

        //arrange
        Department department1 = new Department("Switch");
        Organization organization1 = new Organization("ISEP");
        Employee employee1 = new Employee("João", "Professor",500.50);
        Project project1 = new Project("Isep", "Projeto de ISEP",20000,"Em andamento",organization1);
        Task task1 = new Task("Switch","Em progresso", project1, employee1);

        //act + assert
        assertThrows(Exception.class, () -> new Employee("","Engenheiro", 2500,task1,department1));

    }


    // Null name
    @Test
    public void nullPositionDontCreateAnEmployee() throws Exception {

        //arrange
        Department department1 = new Department("Switch");
        Organization organization1 = new Organization("ISEP");
        Employee employee1 = new Employee("João", "Professor",500.50);
        Project project1 = new Project("Isep", "Projeto de ISEP",20000,"Em andamento",organization1);
        Task task1 = new Task("Switch","Em progresso", project1, employee1);

        //act + assert
        assertThrows(Exception.class, () -> new Employee("João",null, 2500,task1,department1));

    }

    // Blank name
    @Test
    public void BlankPositionDontCreateAnEmployee() throws Exception {

        //arrange
        Department department1 = new Department("Switch");
        Organization organization1 = new Organization("ISEP");
        Employee employee1 = new Employee("João", "Professor",500.50);
        Project project1 = new Project("Isep", "Projeto de ISEP",20000,"Em andamento",organization1);
        Task task1 = new Task("Switch","Em progresso", project1, employee1);

        //act + assert
        assertThrows(Exception.class, () -> new Employee("João","", 2500,task1,department1));

    }

    // Null task
    @Test
    public void nullTaskDontCreateAnEmployee() throws Exception {

        //arrange
        Department department1 = new Department("Switch");

        //act + assert
        assertThrows(Exception.class, () -> new Employee(null,"Engenheiro", 2500,null,department1));

    }

    // Null department
    @Test
    public void nullDepartmentDontCreateAnEmployee() throws Exception {

        //arrange
        Organization organization1 = new Organization("ISEP");
        Employee employee1 = new Employee("João", "Professor",500.50);
        Project project1 = new Project("Isep", "Projeto de ISEP",20000,"Em andamento",organization1);
        Task task1 = new Task("Switch","Em progresso", project1, employee1);

        //act + assert
        assertThrows(Exception.class, () -> new Employee(null,"Engenheiro", 2500,task1,null));

    }

    // change position employee
    @Test
    public void changeEmployeePosition() throws Exception{
        //arrange
        Employee employee1 = new Employee("João", "Professor",500.50);

        // act
        Boolean result = employee1.change_position("Civil");

        //Assert
        assertTrue(result);
    }

    // null change position employee
    @Test
    public void nullDontchangeEmployeePosition() throws Exception{
        //arrange
        Employee employee1 = new Employee("João", "Professor",500.50);

        // act
        Boolean result = employee1.change_position(null);

        //Assert
        assertFalse(result);
    }

    // change salary employee
    @Test
    public void changeEmployeeSalary() throws Exception{
        //arrange
        Employee employee1 = new Employee("João", "Professor",500.50);

        // act
       employee1.change_salary(2500);

        //Assert
        assertEquals(2500, employee1.get_salary());

    }

    // null dont change salary employee
    @Test
    public void Minus0DontchangeEmployeeSalary() throws Exception{
        //arrange
        Employee employee1 = new Employee("João", "Professor",500.50);

        // act
        //Assert
        assertThrows(IllegalArgumentException.class, () -> {employee1.change_salary(-1);} );
    }

    // change task employee
    @Test
    public void changeEmployeeTask() throws Exception{
        //arrange
        Organization organization1 = new Organization("ISEP");
        Employee employee1 = new Employee("João", "Professor",500.50);
        Project project1 = new Project("Isep", "Projeto de ISEP",20000,"Em andamento",organization1);
        Task task1 = new Task("Switch","Em progresso", project1, employee1);

        // act
        Boolean result = employee1.change_task(task1);

        //Assert
        assertTrue(result);
    }

    // null dont change task

    @Test
    public void NullDontchangeEmployeeTask() throws Exception{
        //arrange
        Employee employee1 = new Employee("João", "Professor",500.50);

        // act
        Boolean result = employee1.change_task(null);

        //Assert
        assertFalse(result);
    }

    // Está no departamento?

    @Test
    public void isInDepartment() throws Exception{
        //arrange
        Department department1 = new Department("Switch");
        Employee employee1 = new Employee("João", "Professor",500.50,department1) ;

        // act
        Boolean result = employee1.isInDepartment(department1);

        //Assert
        assertTrue(result);
    }



}