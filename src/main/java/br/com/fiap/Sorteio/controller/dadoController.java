package br.com.fiap.Sorteio.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("dado")
@Tag(name = "dado", description = "Endpoint relacionados ao dado")
public class DadoController {
    
    @GetMapping    
    public int rolarDado(){     
        return (int)(Math.random() * 6) + 1;  
    }

    @GetMapping("{maximo}")    
    public int rolarDadoMaximo(@PathVariable int maximo){
        return (int)(Math.random() * maximo) + 1;
    }

}
