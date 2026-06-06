package br.edu.univasf.SGC.poo.service;

import br.edu.univasf.SGC.poo.Repository.PessoaRepository;
import br.edu.univasf.SGC.poo.entidades.*;
import br.edu.univasf.SGC.poo.controller.CadastroController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValidadorPerfil {

    @Autowired
    private PessoaRepository pessoaRepository;

    // Login
    public Pessoa autenticar(String email, String senha) {
        Pessoa pessoa = pessoaRepository.findByEmail(email).orElseThrow(() ->
                new RuntimeException("ERRO: E-mail não encontrado!"));

        if(!pessoa.getSenha().equals(senha)) {
            throw new RuntimeException("ERRO: Senha incorreta!");
        }

        return pessoa;
    }

    // Cadastro Polimórfico

    public Pessoa cadastro(int idPessoa, CadastroController dados) {

        // Buscar a pessoa no banco usando o ID correto (Long)
        Pessoa pessoa = pessoaRepository.findById(idPessoa).orElseThrow(() ->
                new RuntimeException("ERRO: Usuário não encontrado!"));

        // Caso já tenha feito o primeiro login antes
        if(!pessoa.isPrimeiroLogin()) {
            throw new RuntimeException("Esse cadastro já foi realizado!");
        }

        // Polimorfismo: Downcasting  com instanceof
        if(pessoa instanceof Aluno) {
            Aluno aluno = (Aluno) pessoa;
            aluno.setMatricula(dados.getMatricula());

        } else if (pessoa instanceof Professor) {
            Professor professor = (Professor) pessoa;
            professor.setDisciplina(dados.getDisciplina());

        } else if (pessoa instanceof Administrador) {
            Administrador admin = (Administrador) pessoa;
            admin.setSetor(dados.getSetor());
        }

        // Altera a flag para false, pois o primeiro acesso acabou de ser concluído
        pessoa.setPrimeiroLogin(false);

        // Salva as alterações de volta no banco de dados através do repositório
        return pessoaRepository.save(pessoa);
    }
}