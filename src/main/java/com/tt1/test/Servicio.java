package com.tt1.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Servicio {

    private Repositorio repositorio;
    private MailerStub mailer;

    public Servicio(Repositorio repositorio, MailerStub mailer) {
        this.repositorio = repositorio;
        this.mailer = mailer;
    }

    public void crearTarea(String nombre, LocalDate fechaLimite) {
        ToDo nuevaTarea = new ToDo();
        nuevaTarea.setNombre(nombre);
        nuevaTarea.setFechaLimite(fechaLimite);
        nuevaTarea.setCompletado(false);

        repositorio.guardarToDo(nuevaTarea);

        verificarTareasCaducadasYNotificar();
    }

    public void agregarEmail(String email) {
        repositorio.guardarEmail(email);
        verificarTareasCaducadasYNotificar();
    }

    public void marcarTareaComoFinalizada(String nombre) {
        repositorio.marcarComoCompletado(nombre);
        verificarTareasCaducadasYNotificar();
    }

    public List<ToDo> consultarPendientes() {
        return new ArrayList<>();
    }

    private void verificarTareasCaducadasYNotificar() {
    }
}