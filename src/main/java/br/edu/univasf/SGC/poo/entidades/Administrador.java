package br.edu.univasf.SGC.poo.entidades;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("ADMIN") // Grava "ADMIN" na coluna tipo_pessoa da tb_pessoa
public class Administrador extends Pessoa {

    private String setor;

    public Administrador() {
        super();
        this.perfil = Perfil.ADMIN;
    }

    public Administrador(String nome, String CPF, String email, String senha,
                         String telefone, Perfil perfil, String setor) {
        super(nome, CPF, email, senha, telefone, Perfil.ADMIN);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
}