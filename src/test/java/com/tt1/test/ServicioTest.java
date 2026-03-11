package com.tt1.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ServicioTest {

    private Servicio servicio;
    private Repositorio repositorio;
    private DBStub dbStub;
    private MailerStub mailerStub;

    @BeforeEach
    void setUp() {

        dbStub = new DBStub();
        repositorio = new Repositorio(dbStub);
        mailerStub = new MailerStub();

        servicio = new Servicio(repositorio, mailerStub);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void crearTarea() {
        String nombre = "prueba";
        LocalDate fecha = LocalDate.now().plusDays(2);

        assertDoesNotThrow(() -> {
            servicio.crearTarea(nombre, fecha);
        });
    }

    @Test
    void agregarEmail() {
        String email = "luarias@unirioja.es";

        assertDoesNotThrow(() -> {
            servicio.agregarEmail(email);
        });
    }

    @Test
    void marcarTareaComoFinalizada() {
        assertDoesNotThrow(() -> {
            servicio.marcarTareaComoFinalizada("prueba");
        });
    }

    @Test
    void consultarPendientes() {
        assertDoesNotThrow(() -> {
            servicio.consultarPendientes();
        });
    }
}