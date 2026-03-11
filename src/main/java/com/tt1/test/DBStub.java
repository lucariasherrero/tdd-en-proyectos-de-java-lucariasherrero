package com.tt1.test;

import java.util.List;
import java.util.ArrayList;

public class DBStub {
    private List<ToDo> tareas = new ArrayList<>();
    private List<String> agendaEmails = new ArrayList<>();

    public DBStub() {
    }


    public void agregarTarea(ToDo tarea) {
        this.tareas.add(tarea);
    }

    public List<ToDo> obtenerTodasLasTareas() {
        return new ArrayList<>(this.tareas);
    }

    public void actualizarTarea(int id, ToDo tarea) {
    }

    public void eliminarTarea(int id) {
    }



    public void agregarEmail(String email) {
        this.agendaEmails.add(email);
    }

    public List<String> obtenerEmails() {
        return new ArrayList<>(this.agendaEmails);
    }
}