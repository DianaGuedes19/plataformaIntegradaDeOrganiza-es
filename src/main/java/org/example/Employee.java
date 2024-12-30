package org.example;

import java.util.List;

public class Employee {

    private String _name;
    private String _position;
    private double _salary;
    private Task _task;
    private Department _department;


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
    // Employee sem tasks
    public Employee (String name, String position, double salary, Department department){
        if (name == null || name.isBlank()){throw new IllegalArgumentException("Insert a valid name");}
        _name=name;

        if (position == null || position.isBlank()){throw new IllegalArgumentException("Insert a valid position");}
        _position=position;

        if (salary<0) {throw new IllegalArgumentException("Insert a valid salary");}
        _salary=salary;

        if (department == null){throw new IllegalArgumentException("Insert a valid Department");}
        _department=department;

    }

    protected double get_salary() {
        return _salary;
    }

    // Alterar posição do funcionário
    protected boolean change_position(String position) {
        if (position!=null){
        _position = position;
        return true;}
        return false;
    }

    protected void change_salary(double salary) {
        if (salary<0) {throw new IllegalArgumentException("Insert a valid salary");}
        _salary = salary;
    }

    // Alterar tarefa do funcionário
    protected boolean change_task(Task task) {
        if(task!=null){
            _task = task;
            return true;
        }
       return false;}


    // Está no departamento?
    protected  boolean isInDepartment(Department Department){
        return Department == _department;}

}
