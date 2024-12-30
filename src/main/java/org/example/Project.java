package org.example;

import java.util.List;

public class Project {

    private String _name;
    private String _description;
    private double _budget;
    private String _status;

    private Organization _organization;

    private List <Task> tasklist;

    public Project(String name, String description, double budget, String status, Organization organization){
        if (name == null || name.isBlank()){throw new IllegalArgumentException("Insert a valid name");}
        _name=name;

        if (description == null || description.isBlank()){throw new IllegalArgumentException("Insert a valid Description");}
        _description=description;

        if (budget < 0 ){throw new IllegalArgumentException("Insert a valid Budget");}
        _budget=budget;

        if (status == null || status.isBlank()){throw new IllegalArgumentException("Insert a valid Status");}
        _status=status;

        if (organization == null ){throw new IllegalArgumentException("Insert a valid Organization");}
        _organization=organization;
    }

    //Adicionar tarefas ao projeto
    public void addTaskToProject(Task task){
       if (task!=null){
        tasklist.add(task);}
       else { throw new IllegalArgumentException("Task cannot be null"); }
    }
    //Remover tarefas do projeto
    public void removeTaskFromProject(Task task){
        tasklist.remove(task);
    }

    //Atualizar status
    protected boolean changeStatus (String status){
        if (status==null || status.isBlank()){
            return false;
        }
        _status=status;
        return true;
    }

    // Listar todos os projetos e tarefas
    @Override
    public String toString() {
        return "Project{" +
                "tasklist=" + tasklist +
                '}';
    }
}
