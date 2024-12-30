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

        if (task == null){throw new IllegalArgumentException("Insert a valid Task");}
        _task=task;

        if (department == null){throw new IllegalArgumentException("Insert a valid Department");}
        _department=department;
    }

    // Employee sem departamento e Task para resolver problema de dependências
    public Employee (String name, String position, double salary){
        if (name == null || name.isBlank()){throw new IllegalArgumentException("Insert a valid name");}
        _name=name;

        if (position == null || position.isBlank()){throw new IllegalArgumentException("Insert a valid position");}
        _position=position;

        if (salary<0) {throw new IllegalArgumentException("Insert a valid salary");}
        _salary=salary;

    }

    // Alterar posição do funcionário
    protected void change_position(String _position) {
        this._position = _position;
    }

    // Alterar salário do funcionário
    protected void change_salary(double _salary) {
        this._salary = _salary;
    }

    // Alterar tarefa do funcionário
    protected void change_task(Task _task) {
        this._task = _task;
    }

    // Adicionar um funcionário
    public boolean adicionarFuncionário ( Employee employee){
        if (employee!=null){
       listaDeEmployee.add(employee);
        return true; }
        return false;
    }

    // Está no departamento?
    protected  boolean isInDepartment(Department Department){
        return Department == _department;
    }

    //Listar todos os funcionário da organização
    @Override
    public String toString() {
        return "Employee{" +
                "listaDeEmployee=" + listaDeEmployee +
                '}';
    }
}
