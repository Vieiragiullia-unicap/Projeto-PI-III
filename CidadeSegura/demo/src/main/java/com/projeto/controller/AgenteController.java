package com.projeto.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.model.Agente;
import com.projeto.service.AgenteService;

@RestController
@RequestMapping("/agentes")
public class AgenteController {

    @Autowired
    private AgenteService AgenteService;

    /*  // salvando um novo agente
    @PostMapping
    public ResponseEntity<Agente> saveAgente(@RequestBody Agente agente){
        Agente agenteSave = AgenteService.saveAgente(agente);
        return new ResponseEntity<>(agenteSave, HttpStatus.CREATED);
    } */

    // encontrando um objeto pelo id do tipo Agente
    @GetMapping("/{id}")
    public ResponseEntity<Agente> findById(Long id) {
        Optional<Agente> agenteOptional = AgenteService.findById("");
        return new ResponseEntity<Agente>(agenteOptional, HttpStatus.OK);
    }

    // listando todos os agentes
    @GetMapping("/{all}")
    public List<Agente> getAll() {
        return AgenteService.getAll();
    }

    // salvando um novo agente
    @PostMapping
    public ResponseEntity<Agente> createAgente(@RequestBody Agente agente) {
        AgenteService.saveAgente(agente);
        return new ResponseEntity<Agente>(agente, HttpStatus.CREATED);
    }

    // atualizando um agente
    @PutMapping("/{id}")
    public ResponseEntity<Agente> updateAgente(@PathVariable Long id, @RequestBody Agente agenteDetails) {
        Optional<Agente> agenteOptional = AgenteService.findById(id);
        if (agenteOptional.isPresent()) {
            Agente  updateAgente = Agente.get();
            updateAgente.setNome(agenteDetails.getNome());
            updateAgente.setInstituicao(agenteDetails.getInstituicao());
            updateAgente.setEmail(agenteDetails.getEmail());
            return ResponseEntity.ok(AgenteService.saveAgente(updateAgente));
        } else {
            return ResponseEntity.notFound().build();
        }
    } 

    // deletando um agente pelo id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAgente(@PathVariable Long id) {
        AgenteService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}