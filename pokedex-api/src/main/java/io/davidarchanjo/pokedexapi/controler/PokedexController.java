package io.davidarchanjo.pokedexapi.controler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.davidarchanjo.pokedexapi.domain.Pokemon;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("pokedex")
public class PokedexController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void adicionar(@RequestBody Pokemon pokemon) {
        log.info("[POST] - {}", pokemon);
    }
}
