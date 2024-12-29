package org.example;

import org.junit.Test;

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