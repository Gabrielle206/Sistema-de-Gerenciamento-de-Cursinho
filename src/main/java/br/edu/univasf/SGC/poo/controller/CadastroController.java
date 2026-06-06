package br.edu.univasf.SGC.poo.controller;

import br.edu.univasf.SGC.poo.entidades.Disciplina;
import br.edu.univasf.SGC.poo.entidades.Matricula;

public class CadastroController {

    private int id;
    private Matricula matricula;
    private String setor;
    private Disciplina disciplina;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Matricula getMatricula() {
        return matricula;
    }
    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
