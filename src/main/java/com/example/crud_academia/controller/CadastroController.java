package com.example.crud_academia.controller;

import com.example.crud_academia.dto.RequestSaveClienteDTO;
import com.example.crud_academia.dto.RequestReadClienteDTO;
import com.example.crud_academia.dto.RequestUpdateClienteDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/crud_academia/cadastro")
public class CadastroController {

    //endpoint quando estamos trabalhando com chamadas http Rest
    @PostMapping("/create")
    public String create(@RequestBody RequestSaveClienteDTO cliente) {
        return "nome:  " + cliente.getNome() + "\nmatricula:  " + cliente.getMatricula()
                + "\nemail:  " + cliente.getEmail() + "\ngenero:  " + cliente.getGenero()
                + "\nrg:  " + cliente.getRg() + "\ncelular:  " + cliente.getCelular()
                + "\nTodos seus dados foram salvos com sucesso";
    }

    @GetMapping("/read")
    public RequestSaveClienteDTO read(@RequestBody RequestReadClienteDTO filtro) {
        //Fui ao banco de dados buscar os dados do cliente
        System.out.print("Buscando os dados do cliente " + filtro.getMatricula());

        //O banco retornou o dado do cliente
        RequestSaveClienteDTO retorno = new RequestSaveClienteDTO();
        retorno.setNome("Samuel");
        retorno.setMatricula("123456");
        retorno.setCelular("9999999");

        return retorno;
    }

    @PutMapping("/update")
    public String update(@RequestBody RequestUpdateClienteDTO cliente) {
        return "Alteração feita com sucesso!";
    }

    @DeleteMapping("/delete/{matricula}")
    public String delete(@PathVariable("matricula") String matricula) {
        return "Cliente removido com sucesso";
    }

}



