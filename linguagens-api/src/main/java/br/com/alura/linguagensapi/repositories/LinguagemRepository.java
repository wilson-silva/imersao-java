package br.com.alura.linguagensapi.repositories;

import br.com.alura.linguagensapi.entities.Linguagem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LinguagemRepository extends JpaRepository<Linguagem, String> {

}
