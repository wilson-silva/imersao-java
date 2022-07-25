package br.com.alura.linguagensapi.controller;

import br.com.alura.linguagensapi.Linguagem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LinguagemController {

    private List<Linguagem> linguagems = List.of(new Linguagem("Java", ));

    @GetMapping(value = "/linguagem-preferida")
    public String processaLinguagemPreferida(){
        return "Oi, Java";
    }


}
