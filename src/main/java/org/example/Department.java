package org.example;

import java.util.List;

public class Department {

    private String _name;
    private Employee _director;
    private Organization _organization;


    protected List<Employee> employeeList;

    public Department (String name, Employee diretor, Organization organization){
        if(name == null || name.isBlank()) { throw new IllegalArgumentException("Insert a valid name"); }
        _name=name;

        if(diretor == null) { throw new IllegalArgumentException("Insert valid Director"); }
        _director=diretor;

        if(organization == null) { throw new IllegalArgumentException("Insert valid Organization"); }
        _organization = organization;
    }


    public Department (String name){
        if(name == null || name.isBlank()) { throw new IllegalArgumentException("Insert a valid name"); }
        _name=name;
    }

    // Mudar o diretor do Departamento
    public boolean changeDirector (Employee director){
        if (director!=null && director.isInDepartment(this)){
            _director=director;
            return true;
        }
        return false;
    }


    // Adicionar empregado ao Departamento
    public boolean addEmployee (Employee employee){
        if (employee!=null ){
        employeeList.add(employee);
        return true;}
        return false;
    }

    // Remover empregado do Departamento
    public boolean removeEmployee (Employee employee){
        if (employee.isInDepartment(this)){
        employeeList.remove(employee);
        return true;}
        return false;
    }


}

