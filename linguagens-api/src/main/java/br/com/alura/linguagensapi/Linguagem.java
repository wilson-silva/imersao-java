package br.com.alura.linguagensapi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "principaisLinguagens")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Linguagem {

    @Id
    private String id;
    private String title;
    private String image;
    private int ranking;
}
