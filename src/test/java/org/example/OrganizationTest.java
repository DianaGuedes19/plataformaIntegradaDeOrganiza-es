package org.example;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class OrganizationTest {
    // Testes à class com o construtor completo
    @Test
    public void noemptyNameCreatesAOrganization() throws Exception {

        //arrange
        //act + assert
       Organization ISEP = new Organization("ISEP");

    }

    @Test
    public void adicionarDepartamentos () throws Exception{
        //arrange
        Organization organization1 = new Organization("ISEP");
        Employee employee1 = new Employee("João", "Professor",500.50);
        Department department1 = new Department("Switch", employee1,organization1);
        organization1.ListOfDepartments = new ArrayList<>();

        // act
        Boolean result = organization1.adicionarDepartamentos(department1);

        //Assert
        assertTrue(result);
    }

    @Test
    public void nullDontAddDepartment () throws Exception{
        //arrange
        Organization organization1 = new Organization("ISEP");
        organization1.ListOfDepartments = new ArrayList<>();

        // act
        Boolean result = organization1.adicionarDepartamentos(null);

        //Assert
        assertFalse(result);
    }
    @Test
    public void emptyNameDontCreateAProgramme () throws Exception {

        //arrange

        //act + assert

        assertThrows(Exception.class, () -> new Organization(""));

    }

    @Test
    public void nullNameDontCreateAProgramme () throws Exception {

        //arrange

        //act + assert

        assertThrows(Exception.class, () -> new Organization(null));

    }



}