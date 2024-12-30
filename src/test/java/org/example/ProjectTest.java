package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProjectTest {

    // Criar o objeto
    @Test
    public void NormalProjectObject() throws Exception {

        //arrange

        Organization organization1 = new Organization("ISEP");

        //act + assert
        Project project1= new Project("DevSoft","Sprint",3000,"Em progresso",organization1);

    }

    @Test
    public void nullNameDontCreateProject() throws Exception {

        //arrange

        Organization organization1 = new Organization("ISEP");

        //act + assert
        assertThrows(Exception.class, () -> new Project(null,"Sprint",3000,"Em progresso",organization1));

    }

    @Test
    public void BlankNameDontCreateProject() throws Exception {

        //arrange

        Organization organization1 = new Organization("ISEP");

        //act + assert
        assertThrows(Exception.class, () -> new Project("","Sprint",3000,"Em progresso",organization1));

    }

    @Test
    public void nullDescriptionDontCreateProject() throws Exception {

        //arrange

        Organization organization1 = new Organization("ISEP");

        //act + assert
        assertThrows(Exception.class, () -> new Project("DevSoft",null,3000,"Em progresso",organization1));

    }

    @Test
    public void BlankDescriptionDontCreateProject() throws Exception {

        //arrange

        Organization organization1 = new Organization("ISEP");

        //act + assert
        assertThrows(Exception.class, () -> new Project("DevSoft", "",3000,"Em progresso",organization1));

    }

    @Test
    public void nullStatusDontCreateProject() throws Exception {

        //arrange

        Organization organization1 = new Organization("ISEP");

        //act + assert
        assertThrows(Exception.class, () -> new Project("DevSoft","Sprint",3000,null,organization1));

    }

    @Test
    public void BlankStatusDontCreateProject() throws Exception {

        //arrange

        Organization organization1 = new Organization("ISEP");

        //act + assert
        assertThrows(Exception.class, () -> new Project("DevSoft","Sprint",3000,"",organization1));

    }

    @Test
    public void Minus0BudgetDontCreateProject() throws Exception {

        //arrange

        Organization organization1 = new Organization("ISEP");

        //act + assert
        assertThrows(Exception.class, () -> new Project("DevSoft","Sprint",-1,"Em progresso",organization1));

    }
}