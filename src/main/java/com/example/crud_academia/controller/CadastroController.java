package com.example.crud_academia.controller;

import com.example.crud_academia.dto.ClienteDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/crud_academia/cadastro")
public class CadastroController {

    //endpoint quando estamos trabalhando com chamadas http Rest
    @PostMapping("/create")
    public String create(@RequestBody ClienteDTO cliente) {
        return "nome:  " + cliente.getNome() + "\nmatricula:  " + cliente.getMatricula()
                + "\nemail:  " + cliente.getEmail() + "\ngenero:  " + cliente.getGenero()
                + "\nrg:  " + cliente.getRg() + "\ncelular:  " + cliente.getCelular()
                + "\nTodos seus dados foram salvos com sucesso";
    }

    @GetMapping("/read")
    public String read(@RequestBody ClienteDTO cliente){
        return "Alteração feita com sucesso!";
    }

    @PutMapping("/update")
    public String update(@RequestBody ClienteDTO cliente){
        return "Alteração feita com sucesso!";
    }

    @DeleteMapping("/delete/{matricula}")
    public String delete(@PathVariable("matricula") String matricula){
        return "Cliente removido com sucesso";
    }

}



