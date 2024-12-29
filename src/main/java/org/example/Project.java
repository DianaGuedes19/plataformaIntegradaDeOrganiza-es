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
        _name=name;
        _description=description;
        _budget=budget;
        _status=status;
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
    public boolean changeStatus (String status){
        if (status==null || status.isBlank()){
            return false;
        }
        _status=status;
        return true;
    }

}
