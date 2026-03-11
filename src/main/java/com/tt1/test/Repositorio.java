package com.tt1.test;

import java.util.List;

public class Repositorio {

    private DBStub db;

    public Repositorio(DBStub db) {
        this.db = db;
    }



    public ToDo encontrarToDo(String nombre) {
        return db.obtenerTodasLasTareas().stream()
            .filter(t -> t.getNombre().equals(nombre))
            .findFirst()
            .orElse(null);
    }

    public void marcarComoCompletado(String nombre) {
    }

    public void guardarToDo(ToDo todo) {
        db.agregarTarea(todo);
    }

    public void guardarEmail(String email) {
        db.agregarEmail(email);
    }
}