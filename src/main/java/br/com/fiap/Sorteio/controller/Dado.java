package br.com.fiap.Sorteio.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import org.springframework.hateoas.EntityModel;

public class Dado {
    private int numero;
    
    public EntityModel<Dado> toEntityModel() {
        return EntityModel.of(
                this,
                linkTo(methodOn(DadoController.class).rolarDado()).withSelfRel(),
                linkTo(methodOn(DadoController.class).rolarDadoMaximo(numero)).withRel("maximo")                
            );
    }    
    
}
