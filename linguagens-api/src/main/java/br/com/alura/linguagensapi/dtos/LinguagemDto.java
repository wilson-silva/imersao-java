package br.com.alura.linguagensapi.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LinguagemDto {

    private String title;
    private String image;
    private int ranking;
}
