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

        _project=project;
        _employee = employee;
    }

    // Mudar o employee da tarefa
    public boolean assignTask (Employee TaskEmployee){
    if (TaskEmployee!=null){
        _employee=TaskEmployee;
        return true;
    }
    return false;
    }

    //Mudar o Status
    public void changeStatus (String Newstatus){
    _status = Newstatus;
    }

    // Listar Tarefas
    @Override
    public String toString() {
        return "Task{" +
                "_name='" + _name + '\'' +
                ", _status='" + _status + '\'' +
                ", _project=" + _project +
                ", _employee=" + _employee +
                '}';
    }
}
