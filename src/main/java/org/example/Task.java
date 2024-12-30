package org.example;

public class Task {
    private String _name;
    private String _status;
    private Project _project;
    private Employee _employee;

    public Task (String name, String status, Project project, Employee employee){
        if (name == null || name.isBlank()){throw new IllegalArgumentException("Insert a valid name");}
        _name=name;

        if (status == null || status.isBlank()){throw new IllegalArgumentException("Insert a valid status");}
        _status=status;

        if (project == null){throw new IllegalArgumentException("Insert a valid project");}
        _project=project;

        if (employee == null){throw new IllegalArgumentException("Insert a valid employee");}
        _employee = employee;
    }

    // Mudar o employee responsável da tarefa
    public boolean changeEmployeeTask (Employee TaskEmployee){
    if (TaskEmployee!=null){
        _employee=TaskEmployee;
        return true;
    }
    return false;
    }

    //Mudar o Status
    protected void changeStatus (String Newstatus){
    _status = Newstatus;
    }

    // Listar Tarefas e Projeto
    @Override
    public String toString() {
        return "Task{" +
                "_project=" + _project +
                '}';
    }
}
