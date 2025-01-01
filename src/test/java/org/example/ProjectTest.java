package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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

    // add Task to a Project
    @Test
    public void addTaskToAProject() throws Exception{
        //arrange
        Organization organization1 = new Organization("ISEP");
        Project project1 = new Project("DevSoft","Sprint",3000,"Em progresso",organization1);
        Employee employee1 = new Employee("João", "Professor",500.50);
        Task task1 = new Task("Switch","Em progresso", project1, employee1);

        // act
        Boolean result = project1.addTaskToProject(task1);

        //Assert
        assertTrue(result);

    }

    // add Task null
    @Test
    public void dontAddTaskToProject() throws Exception{
        //arrange
        Organization organization1 = new Organization("ISEP");
        Project project1 = new Project("DevSoft","Sprint",3000,"Em progresso",organization1);

        // act
        Boolean result = project1.addTaskToProject(null);

        //Assert
        assertFalse(result);

    }

    //Remover tarefas
    @Test
    public void removeTaskFromProject() throws Exception {
        // arrange
        Organization organization1 = new Organization("ISEP");
        Project project1 = new Project("DevSoft", "Sprint", 3000, "Em progresso", organization1);
        Employee employee1 = new Employee("João", "Professor", 500.50);
        Task task1 = new Task("Switch", "Em progresso", project1, employee1);
        Task task2 = new Task("FixBug", "Pendente", project1, employee1);

        // Inicializa a lista de tarefas e adiciona tarefas ao projeto
        project1.addTaskToProject(task1);
        project1.addTaskToProject(task2);

        // act
        project1.removeTaskFromProject(task1);

        // assert
        assertFalse(project1.tasklist.contains(task1));
        assertTrue(project1.tasklist.contains(task2));
        assertEquals(1, project1.tasklist.size());
    }

    // change status
    @Test
    public void changeStatus() throws Exception{
        //arrange
        Organization organization1 = new Organization("ISEP");
        Project project1 = new Project("DevSoft","Sprint",3000,"Em progresso",organization1);

        // act
        Boolean result = project1.changeStatus("Concluido");

        //Assert
        assertTrue(result);

    }

    // dont change status
    @Test
    public void DontchangeStatusNull() throws Exception{
        //arrange
        Organization organization1 = new Organization("ISEP");
        Project project1 = new Project("DevSoft","Sprint",3000,"Em progresso",organization1);

        // act
        Boolean result = project1.changeStatus(null);

        //Assert
        assertFalse(result);

    }

    // dont change status blank
    @Test
    public void DontchangeStatusblank() throws Exception{
        //arrange
        Organization organization1 = new Organization("ISEP");
        Project project1 = new Project("DevSoft","Sprint",3000,"Em progresso",organization1);

        // act
        Boolean result = project1.changeStatus("");

        //Assert
        assertFalse(result);

    }

}