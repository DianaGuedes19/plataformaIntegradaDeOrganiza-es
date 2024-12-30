package org.example;

import java.util.List;

public class Department {

    private String _name;
    private Employee _director;
    private Organization _organization;


    private List<Employee> employeeList;

    public Department (String name, Employee diretor, Organization organization){
        if(name == null || name.isBlank()) { throw new IllegalArgumentException("Insert a valid name"); }
        _name=name;

        if(diretor == null) { throw new IllegalArgumentException("Insert valid Director"); }
        _director=diretor;

        if(organization == null) { throw new IllegalArgumentException("Insert valid Organization"); }
        _organization = organization;
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
    public void addEmployee (Employee employee){
        if (employee!=null && employee.isInDepartment(this)){
        employeeList.add(employee);}
    }

    // Remover empregado do Departamento
    public void removeEmployee (Employee employee){
        employeeList.remove(employee);
    }

    // Visualizar detalhes do departamento
    @Override
    public String toString() {
        return "Department{" +
                "_name='" + _name + '\'' +
                ", _director=" + _director +
                ", _organization=" + _organization +
                ", employeeList=" + employeeList +
                '}';
    }

}

