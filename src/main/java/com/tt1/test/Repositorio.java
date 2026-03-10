package com.tt1.test;

import java.util.List;

public class Repositorio {

    // El repositorio necesita conocer el "almacén" de datos
    private DBStub db;

    public Repositorio(DBStub db) {
        // En el futuro, aquí asignaremos la instancia del stub
    }

    // --- Métodos requeridos por la práctica ---

    public ToDo encontrarToDo(String nombre) {
        throw new UnsupportedOperationException("Clase aún no implementada."); [cite: 50]
    }

    public void marcarComoCompletado(String nombre) {
        throw new UnsupportedOperationException("Clase aún no implementada."); [cite: 50]
    }

    public void guardarToDo(ToDo todo) {
        throw new UnsupportedOperationException("Clase aún no implementada."); [cite: 50]
    }

    public void guardarEmail(String email) {
        throw new UnsupportedOperationException("Clase aún no implementada."); [cite: 50]
    }
}