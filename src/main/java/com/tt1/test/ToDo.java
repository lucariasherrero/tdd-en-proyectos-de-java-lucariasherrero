package com.tt1.test;

import java.time.LocalDate;

/**
 * Clase que representa una tarea individual (To-Do).
 */
public class ToDo {
    private String nombre;
    private LocalDate fechaLimite;
    private boolean completado;


    public ToDo() {
    }


    /**
     * Obtiene el nombre de la tarea.
     * @return El nombre actual.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la tarea.
     * @param nombre El nuevo nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la fecha límite de la tarea.
     * @return La fecha de vencimiento.
     */
    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    /**
     * Establece la fecha límite de la tarea.
     * @param fechaLimite La nueva fecha límite.
     */
    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    /**
     * Comprueba si la tarea está completada.
     * @return true si está terminada, false en caso contrario.
     */
    public boolean isCompletado() {
        return completado;
    }

    /**
     * Cambia el estado de finalización de la tarea.
     * @param completado El nuevo estado.
     */
    public void setCompletado(boolean completado) {
        this.completado = completado;
    }
}