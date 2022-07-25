package br.com.alura.linguagensapi;

import br.com.alura.linguagensapi.Linguagem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LinguagemRepository extends MongoRepository<Linguagem, String> {

}
