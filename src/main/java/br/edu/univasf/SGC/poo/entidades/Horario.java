package br.edu.univasf.SGC.poo.entidades;

import java.time.LocalTime;

enum Turno {
    Matutino,
    Vespertino,
    Noturno,
    Integral
}

public class Horario {

    private int id;
    private String diaSemana;
    private LocalTime horaInicio;
    private LocalTime horaFim;
    private Turno turno;

    public Horario() {
    }

    public Horario(int id, String diaSemana, LocalTime horaInicio, LocalTime horaFim, Turno turno) {
        this.id = id;
        this.diaSemana = diaSemana;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.turno = turno;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getDiaSemana() {
        return diaSemana;
    }
    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }
    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFim() {
        return horaFim;
    }
    public void setHoraFim(LocalTime horaFim) {
        this.horaFim = horaFim;
    }

    public Turno getTurno() {
        return turno;
    }
    public void setTurno(Turno turno) {
        this.turno = turno;
    }
}
