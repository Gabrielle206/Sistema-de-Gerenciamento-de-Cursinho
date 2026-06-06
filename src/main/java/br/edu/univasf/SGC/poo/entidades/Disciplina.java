package br.edu.univasf.SGC.poo.entidades;

public class Disciplina {

    private int id;
    private String cod;
    private String nome;

    public Disciplina() {
    }

    public Disciplina(int id, String cod, String nome) {
        this.id = id;
        this.cod = cod;
        this.nome = nome;
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

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
