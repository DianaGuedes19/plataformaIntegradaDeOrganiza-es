package org.example;

import java.util.List;

public class Organization {
    private String _name;

    protected List<Inventory> Inventory;
    protected List <Project> Project;
    protected List <Department> ListOfDepartments;

    public Organization(String name) throws Exception{
        if(name == null || name.isBlank()) { throw new IllegalArgumentException("Insert a valid name"); }
        _name=name;
    }


    // Adicionar departamentos
    public boolean adicionarDepartamentos (Department department){
        if(department!=null){
            ListOfDepartments.add(department);
            return true;
        }
        return false;
    }
}
