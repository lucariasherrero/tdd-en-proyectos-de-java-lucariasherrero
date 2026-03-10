package com.tt1.test;

import java.util.List;
import java.util.ArrayList;

public class DBStub {
    // Colecciones internas para emular la base de datos
    private List<ToDo> tareas;
    private List<String> agendaEmails;

    public DBStub() {
        // Inicialización (aunque no la usemos todavía por el throw)
    }

    // --- Métodos CRUD para ToDo ---

    public void agregarTarea(ToDo tarea) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public List<ToDo> obtenerTodasLasTareas() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void actualizarTarea(int id, ToDo tarea) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void eliminarTarea(int id) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    // --- Métodos para la Agenda de Emails ---

    public void agregarEmail(String email) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public List<String> obtenerEmails() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
}