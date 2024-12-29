package org.example;

import java.util.List;

public class Employee {

    private String _name;
    private String _position;
    private double _salary;
    private Task _task;
    private Department _department;

    public List<Employee> listaDeEmployee;

    public Employee (String name, String position, double salary, Task task, Department department){
        if (name == null || name.isBlank()){throw new IllegalArgumentException("Insert a valid name");}
        _name=name;

        if (position == null || position.isBlank()){throw new IllegalArgumentException("Insert a valid position");}
        _position=position;

        if (salary<0) {throw new IllegalArgumentException("Insert a valid salary");}
        _salary=salary;

        _task=task;
        _department=department;
    }

    public void adicionarFuncionário ( Employee employee){
        listaDeEmployee.add(employee);
    }

    // Está no departamento?
    protected  boolean isInDepartment(Department Department){
        return Department == _department;
    }

}
