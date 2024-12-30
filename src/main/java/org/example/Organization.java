package org.example;

import java.util.List;

public class Organization {
    private String _name;

    private List<Inventory> Inventory;
    private List <Project> Project;
    private List <Department> ListGfDepartments;

    public Organization(String name) throws Exception{
        if(name == null || name.isBlank()) { throw new IllegalArgumentException("Insert a valid name"); }
        _name=name;
    }


    // Mostrar detalhes da organização
    @Override
    public String toString() {
        return "Organization{" +
                "_name='" + _name + '\'' +
                ", Inventory=" + Inventory +
                ", Project=" + Project +
                ", ListGfDepartments=" + ListGfDepartments +
                '}';
    }

    // Adicionar depaertamentos
    public void adicionarDepartamentos (Department department){
        if(department!=null){
            ListGfDepartments.add(department);
        }
    }
}
