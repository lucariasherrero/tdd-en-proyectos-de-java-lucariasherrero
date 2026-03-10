package com.tt1.test;

import java.time.LocalDate;
import java.util.List;

public class Servicio {

    // Dependencias necesarias para la lógica de negocio
    private Repositorio repositorio;
    private MailerStub mailer;

    public Servicio(Repositorio repositorio, MailerStub mailer) {
        // En el futuro, aquí conectaremos las piezas
    }

    // --- Métodos de operación del usuario ---

    public void crearTarea(String nombre, LocalDate fechaLimite) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void agregarEmail(String email) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void marcarTareaComoFinalizada(String nombre) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public List<ToDo> consultarPendientes() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    // --- Método interno de soporte ---

    private void verificarTareasCaducadasYNotificar() {
        // Este método se llamará automáticamente en cada operación
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
}