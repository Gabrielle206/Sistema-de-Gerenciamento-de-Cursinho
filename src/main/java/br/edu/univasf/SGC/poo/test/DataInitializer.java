package br.edu.univasf.SGC.poo.test;

import br.edu.univasf.SGC.poo.entidades.Administrador;
import br.edu.univasf.SGC.poo.entidades.Aluno;
import br.edu.univasf.SGC.poo.entidades.Professor;
import br.edu.univasf.SGC.poo.Repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component // Avisa ao Spring para gerenciar esta classe
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Override
    public void run(String... args) throws Exception {

        // Limpa o banco para não duplicar dados toda vez que reiniciar
        pessoaRepository.deleteAll();

        System.out.println("====== INICIALIZANDO DADOS DE TESTE ======");

        // 1. Cadastrando um Aluno para teste (Campos específicos 'matricula' e 'turma' iniciam como null)
        Aluno alunoTeste;
        alunoTeste = new Aluno (
                "Lucas Aluno",
                "111.111.111-11",
                "aluno@SGC.com",
                "senha123",
                "(87) 99999-1111",
                null,
                null,
                null
        );
        pessoaRepository.save(alunoTeste);

        // 2. Cadastrando um Professor para teste (Campos específicos 'disciplina' e 'registroSiape' como null)
        Professor profTeste = new Professor(
                "Roberta Professora",
                "222.222.222-22",
                "professor@SGC.com",
                "senha123",
                "(87) 99999-2222",
                null,
                null
        );
        pessoaRepository.save(profTeste);

        // 3. Cadastrando um Administrador para teste (Campo específico 'setor' como null)
        Administrador adminTeste = new Administrador(
                "Carlos Admin",
                "333.333.333-33",
                "admin@SGC.com",
                "senha123",
                "(87) 99999-3333",
                null,
                null
        );
        pessoaRepository.save(adminTeste);

        System.out.println("====== DADOS INICIALIZADOS COM SUCESSO ======");
        System.out.println("Contas disponíveis para testar login:");
        System.out.println("-> Aluno: aluno@SGC.com | Senha: senha123");
        System.out.println("-> Professor: professor@SGC.com | Senha: senha123");
        System.out.println("-> Admin: admin@SGC.com | Senha: senha123");
        System.out.println("=============================================");
    }
}