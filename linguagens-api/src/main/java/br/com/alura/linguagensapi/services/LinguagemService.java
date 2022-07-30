package br.com.alura.linguagensapi.services;

import br.com.alura.linguagensapi.entities.Linguagem;
import br.com.alura.linguagensapi.repositories.LinguagemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinguagemService {

    private final LinguagemRepository repository;

    public LinguagemService(LinguagemRepository repository) {
        this.repository = repository;
    }

    public Linguagem save(Linguagem linguagem){
        return repository.save(linguagem);
    }

    public List<Linguagem> findAll(){
        return repository.findAll();
    }



}
