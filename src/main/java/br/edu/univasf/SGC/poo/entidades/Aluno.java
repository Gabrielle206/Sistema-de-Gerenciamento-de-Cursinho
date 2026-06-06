package br.edu.univasf.SGC.poo.entidades;

public class Aluno extends Pessoa {

    private Double nota;
    private String matricula;
    private Turma turma;

    public Aluno() {
        super();
    }

    public Aluno(String nome, String cpf, String email, String telefone, String matricula, Turma turma) {
        super(nome, cpf, email, telefone);
        this.matricula = matricula;
        this.turma = turma;
    }

    public Double getNota() {
        return nota;
    }
    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Turma getTurma() {
        return turma;
    }
    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}