package br.edu.univasf.SGC.poo.entidades;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private int id;
    private String cod;
    private String sala;

    private Disciplina disciplina;
    private List<Aviso> avisos = new ArrayList<>();
    private List<Horario> horarios = new ArrayList<>();

    public Turma() {
    }

    public Turma(int id, String cod, String sala) {
        this.id = id;
        this.cod = cod;
        this.sala = sala;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getCod() {
        return cod;
    }
    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getSala() {
        return sala;
    }
    public void setSala(String sala) {
        this.sala = sala;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public List<Aviso> getAvisos() {
        return avisos;
    }
    public void setAvisos(List<Aviso> avisos) {
        this.avisos = avisos;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }
    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }
}