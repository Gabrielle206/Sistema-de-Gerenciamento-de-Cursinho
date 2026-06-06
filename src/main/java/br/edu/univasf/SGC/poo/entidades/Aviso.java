package br.edu.univasf.SGC.poo.entidades;

import java.time.LocalDateTime;

public class Aviso {
    private int id;
    private String titulo;
    private String conteudo;
    private LocalDateTime dataPublicacao; // Para ordenar os avisos do mais recente ao mais antigo
    private Turma turma; // Para saber de qual turma é esse aviso

    public Aviso() {
    }

    public Aviso(int id, String titulo, String conteudo, LocalDateTime dataPublicacao, Turma turma) {
        this.id = id;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.dataPublicacao = dataPublicacao;
        this.turma = turma;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public LocalDateTime getDataPublicacao() {
        return dataPublicacao;
    }
    public void setDataPublicacao(LocalDateTime dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public Turma getTurma() {
        return turma;
    }
    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
