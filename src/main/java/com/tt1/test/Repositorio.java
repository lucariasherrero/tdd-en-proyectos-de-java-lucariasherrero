package com.tt1.test;

import java.util.List;

/**
 * Capa de persistencia que actúa como intermediaria con el almacenamiento.
 */
public class Repositorio {

    private DBStub db;

    /**
     * Constructor del repositorio.
     * @param db La instancia de la base de datos simulada.
     */
    public Repositorio(DBStub db) {
        this.db = db;
    }



    /**
     * Busca una tarea en el sistema por su nombre.
     * @param nombre Nombre de la tarea a buscar.
     * @return El objeto {@link ToDo} encontrado o null si no existe.
     */
    public ToDo encontrarToDo(String nombre) {
        return db.obtenerTodasLasTareas().stream()
            .filter(t -> t.getNombre().equals(nombre))
            .findFirst()
            .orElse(null);
    }

    /**
     * Cambia el estado de una tarea a completado.
     * @param nombre Nombre de la tarea.
     */
    public void marcarComoCompletado(String nombre) {
    }

    /**
     * Almacena una tarea en la base de datos.
     * @param todo El objeto tarea a guardar.
     */
    public void guardarToDo(ToDo todo) {
        db.agregarTarea(todo);
    }

    /**
     * Guarda un email en el registro de la agenda.
     * @param email Dirección de correo a persistir.
     */
    public void guardarEmail(String email) {
        db.agregarEmail(email);
    }
}