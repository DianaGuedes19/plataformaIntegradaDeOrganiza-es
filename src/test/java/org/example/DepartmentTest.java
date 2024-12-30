package org.example;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class DepartmentTest {

    @Test
    public void noemptyNameCreatesADepartment() throws Exception {

        //arrange
        //act + assert
        Employee employee1 = new Employee("João", "Professor",500.50);
        Organization organization1 = new Organization("ISEP");

        Department ISEP = new Department("ISEP",employee1,organization1);

    }

    @Test
    public void NullNameDontcreateADepartment() throws Exception {

        //arrange
        //act + assert
        Employee employee1 = new Employee("João", "Professor",500.50);
        Organization organization1 = new Organization("ISEP");

        assertThrows(Exception.class, () -> new Department(null, employee1, organization1));
    }

    @Test
    public void BlankNameDontcreateADepartment() throws Exception {

        //arrange
        //act + assert
        Employee employee1 = new Employee("João", "Professor",500.50);
        Organization organization1 = new Organization("ISEP");

        assertThrows(Exception.class, () -> new Department("", employee1, organization1));
    }

    @Test
    public void NullDirectorDontcreateADepartment() throws Exception {

        //arrange
        //act + assert
        Employee employee1 = new Employee("João", "Professor",500.50);
        Organization organization1 = new Organization("ISEP");

        assertThrows(Exception.class, () -> new Department("Diana", null, organization1));
    }

    @Test
    public void createsDepartment() throws Exception {

        //arrange
        //act + assert
        Employee employee1 = new Employee("João", "Professor",500.50);
        Organization organization1 = new Organization("ISEP");

        assertThrows(Exception.class, () -> new Department("Switch", null, organization1));
    }



    @Test
    public void addEmployeeToDepartment() throws Exception{
        //arrange
        Department department1 = new Department("Switch");
        Employee employee1 = new Employee("João", "Professor",500.50, department1);
        department1.employeeList = new ArrayList<>();

        // act
        Boolean result = department1.addEmployee(employee1);

        //Assert
        assertTrue(result);
    }

    @Test
    public void nullEmployeeDontToDepartment() throws Exception{
        //arrange
        Department department1 = new Department("Switch");
        Employee employee1 = new Employee("João", "Professor",500.50, department1);
        department1.employeeList = new ArrayList<>();

        // act
        Boolean result = department1.addEmployee(null);

        //Assert
        assertFalse(result);
    }



    @Test
    public void removeEmployeeToDepartment() throws Exception{
        //arrange
        Department department1 = new Department("Switch");
        Employee employee1 = new Employee("João", "Professor",500.50, department1);
        department1.employeeList = new ArrayList<>();

        // act
        Boolean result = department1.removeEmployee(employee1);

        //Assert
        assertTrue(result);
    }

    @Test
    public void DontRemoveEmployeeOFDepartmentThatDontBelong() throws Exception{
        //arrange
        Department department2 = new Department("Switch");
        Department department1 = new Department("PTH");
        Employee employee1 = new Employee("João", "Professor",500.50, department2);
        department1.employeeList = new ArrayList<>();

        // act
        Boolean result = department1.removeEmployee(employee1);

        //Assert
        assertFalse(result);
    }

    @Test
    public void changeDirector() throws Exception{
        //arrange
        Department department1 = new Department("Switch");
        Employee employee1 = new Employee("João", "Professor",500.50, department1);

        // act
        Boolean result = department1.changeDirector(employee1);

        //Assert
        assertTrue(result);
    }

    @Test
    public void DontchangeDirector() throws Exception{
        //arrange
        Department department1 = new Department("Switch");
        Department department2 = new Department("PTH");
        Employee employee1 = new Employee("João", "Professor",500.50, department2);

        // act
        Boolean result = department1.changeDirector(employee1);

        //Assert
        assertFalse(result);
    }




}