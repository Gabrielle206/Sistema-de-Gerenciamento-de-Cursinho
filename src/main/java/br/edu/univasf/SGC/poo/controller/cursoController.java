package br.edu.univasf.SGC.poo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("curso")

public class cursoController {

    @GetMapping
    public void getAll() {

    }
}
