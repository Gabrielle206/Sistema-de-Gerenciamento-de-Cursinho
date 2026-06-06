package br.edu.univasf.SGC.poo.entidades;

public class Professor extends Pessoa {

    private String disciplina;

    public Professor() {
    }

    public Professor(String nome, String CPF, String email, String telefone, String disciplina) {
        super(nome, CPF, email, telefone);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
