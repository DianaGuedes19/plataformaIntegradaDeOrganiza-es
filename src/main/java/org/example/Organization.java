package org.example;

import java.util.List;

public class Organization {
    private String _name;

    private List<Inventory> Inventory;
    private List <Project> Project;
    private List <Department> Department;

    public Organization(String name) throws Exception{
        if(name == null || name.isBlank()) { throw new IllegalArgumentException("Insert a valid name"); }
        _name=name;
    }
}
