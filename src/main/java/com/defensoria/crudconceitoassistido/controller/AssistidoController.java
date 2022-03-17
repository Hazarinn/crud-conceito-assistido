package com.defensoria.crudconceitoassistido.controller;

import com.defensoria.crudconceitoassistido.dto.AssistidoDTO;
import com.defensoria.crudconceitoassistido.model.Assistido;
import com.defensoria.crudconceitoassistido.service.AssistidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assistido")
public class AssistidoController {

    private AssistidoService service;

    @Autowired
    public AssistidoController(AssistidoService assistidoService){
        this.service= assistidoService;
    }

    @GetMapping
    public ResponseEntity<List<Assistido>> listaTodosAssistidos(){
        return  ResponseEntity.ok(service.listaTodosAssistidos());
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity<Assistido> criaAssistido(@RequestBody Assistido assistido) {
        return  ResponseEntity.ok(service.criaOuAtualizaAssistido(assistido));
    }

    @PutMapping(path = {"/{id}"})
    @ResponseBody
    public ResponseEntity atualizaAssistido(@RequestBody Assistido assistido, @PathVariable Long id){
        assistido.setId(id);
        service.criaOuAtualizaAssistido(assistido);
        return  ResponseEntity.noContent().build();
    }

    @DeleteMapping(path = {"/{id}"})
    public ResponseEntity excluirAssistido(@PathVariable Long id){
        service.excluirAssistido(id);
        return ResponseEntity.noContent().build();
    }
}
