package br.edu.univasf.SGC.poo.entidades;

enum StatusMatricula {
    ATIVA,
    TRANCADA,
    APROVADA,
    REPROVADA
}

public class Matricula {

    private int id;
    private Aluno aluno;   // A qual aluno pertence
    private Turma turma;   // A qual turma pertence
    private StatusMatricula status; // Aqui entra o seu ENUM com os 4 estados

    public Matricula(int id, Aluno aluno, Turma turma, StatusMatricula status) {
        this.id = id;
        this.aluno = aluno;
        this.turma = turma;
        this.status = status;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }
    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public StatusMatricula getStatus() {
        return status;
    }
    public void setStatus(StatusMatricula status) {
        this.status = status;
    }
}
