package com.tt1.test;

import java.time.LocalDate;

public class ToDo {
    // Atributos privados según el enunciado
    private String nombre;
    private String descripcion;
    private LocalDate fechaLimite; // LocalDate es la forma más sencilla en Java moderno
    private boolean completado;

    // Constructor sin argumentos (Requisito de JavaBean)
    public ToDo() {
    }

    // Métodos con la excepción requerida por la práctica
    public String getNombre() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void setNombre(String nombre) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public String getDescripcion() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void setDescripcion(String descripcion) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public LocalDate getFechaLimite() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void setFechaLimite(LocalDate fechaLimite) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public boolean isCompletado() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void setCompletado(boolean completado) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
}