package br.com.fiap.Sorteio.Dado;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("dado")
@Tag(name = "Dado", description = "Endpoint relacionado ao dado")
public class DadoController {
    
    @GetMapping    
    @Operation(summary = "Rola o dado com valor de 1 a 6")
    public int rolarDado(){     
        Dado dado = new Dado();
        dado.setNumero((int)(Math.random() * 6) + 1);              
        return dado.getNumero();  
    }

    @GetMapping("{maximo}")    
    @Operation(summary = "Rola o dado com valor máximo personalizado")
    public int rolarDadoMaximo(@PathVariable int maximo){
        Dado dado = new Dado();
        dado.setNumero((int)(Math.random() * maximo) + 1);              
        return dado.getNumero();
    }

}
