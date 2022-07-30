package br.com.alura.linguagensapi.controllers;

import br.com.alura.linguagensapi.entities.Linguagem;
import br.com.alura.linguagensapi.repositories.LinguagemRepository;
import br.com.alura.linguagensapi.services.LinguagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LinguagemController {


    private final LinguagemService service;

    public LinguagemController(LinguagemService service) {
        this.service = service;
    }

    @GetMapping("/linguagens")
    public List<Linguagem> obterLinguagens(){
        return service.findAll();
    }

    @PostMapping("/linguagens")
    public ResponseEntity<Linguagem> cadastrarLinguagem(@RequestBody Linguagem linguagem){
       return ResponseEntity.status(HttpStatus.CREATED).body(service.save(linguagem));
    }


}
