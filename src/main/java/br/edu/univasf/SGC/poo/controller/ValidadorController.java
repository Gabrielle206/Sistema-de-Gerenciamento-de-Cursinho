package br.edu.univasf.SGC.poo.controller;

import br.edu.univasf.SGC.poo.entidades.Pessoa;
import br.edu.univasf.SGC.poo.service.ValidadorPerfil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:5173") // Libera o acesso para o React (porta padrão do Vite)

public class ValidadorController {

    @Autowired
    private ValidadorPerfil validadorPerfil;

    @PostMapping("/login")
    public ResponseEntity<?> efetuarLogin(@RequestBody LoginRequest dadosLogin) {
        try {
            // Chama o metodo autenticar
            Pessoa usuarioLogado = validadorPerfil.autenticar(dadosLogin.getEmail(), dadosLogin.getSenha());

            return ResponseEntity.ok(usuarioLogado);

        } catch (RuntimeException e) {
            // Se der erro (e-mail inexistente ou senha incorreta), retorna status 401 Unauthorized
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
        }
    }

    @PutMapping("/completar-cadastro/{id}")
    public ResponseEntity<?> finalizarCadastro(
            @PathVariable int id,
            @RequestBody CadastroController dadosCadastro) {
        try {
            Pessoa usuarioAtualizado = validadorPerfil.cadastro(id, dadosCadastro);

            return ResponseEntity.ok(usuarioAtualizado);

        } catch (RuntimeException e) {
            // Se o cadastro já tiver sido feito ou o usuário não existir
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
