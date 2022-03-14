package io.davidarchanjo.pokedexapi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pokemon {
    private String name;
    private int id;
    private int height;
    private int weight;    
}
