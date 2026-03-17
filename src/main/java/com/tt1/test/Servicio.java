package com.tt1.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Intermediario encargado de la persistencia y recuperación de datos.
 * Conecta la lógica del servicio con el almacenamiento físico o simulado.
 */
public class Servicio {

    private Repositorio repositorio;
    private MailerStub mailer;

    /**
     * Constructor del servicio.
     * @param repositorio El repositorio para la persistencia de datos.
     * @param mailer El sistema para el envío de notificaciones por correo.
     */
    public Servicio(Repositorio repositorio, MailerStub mailer) {
        this.repositorio = repositorio;
        this.mailer = mailer;
    }

    /**
     * Crea una nueva tarea y la registra en el sistema.
     * @param nombre El nombre o descripción de la tarea.
     * @param fechaLimite La fecha máxima para completar la tarea.
     */
    public void crearTarea(String nombre, LocalDate fechaLimite) {
        ToDo nuevaTarea = new ToDo();
        nuevaTarea.setNombre(nombre);
        nuevaTarea.setFechaLimite(fechaLimite);
        nuevaTarea.setCompletado(false);

        repositorio.guardarToDo(nuevaTarea);

        verificarTareasCaducadasYNotificar();
    }

    /**
     * Añade una dirección de correo a la lista de notificaciones.
     * @param email La dirección de correo electrónico.
     */
    public void agregarEmail(String email) {
        repositorio.guardarEmail(email);
        verificarTareasCaducadasYNotificar();
    }


    /**
     * Marca una tarea específica como completada.
     * @param nombre El nombre de la tarea a finalizar.
     */
    public void marcarTareaComoFinalizada(String nombre) {
        repositorio.marcarComoCompletado(nombre);
        verificarTareasCaducadasYNotificar();
    }

    /**
     * Devuelve la lista de tareas que aún no han sido finalizadas.
     * @return List de objetos {@link ToDo} pendientes.
     */
    public List<ToDo> consultarPendientes() {
        return new ArrayList<>();
    }

    /**
     * Método interno para verificar tareas vencidas y enviar alertas.
     */
    private void verificarTareasCaducadasYNotificar() {
    }
}