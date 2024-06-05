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

import com.projeto.exception.CivilNotFoundException;
import com.projeto.model.Civil;
import com.projeto.service.CivilService;

@RestController
@RequestMapping("/civis")
public class CivilController {

    @Autowired
    private CivilService CivilService;

    @PostMapping
    public ResponseEntity<Civil> saveCivil(@RequestBody Civil civil) throws CivilNotFoundException{
        Civil civilSave = CivilService.save(civil);
        return new ResponseEntity<>(civilSave, HttpStatus.CREATED);
    }

    // pegar um civil pelo id pela rota /civis/{id}
    @GetMapping("/{id}")
    public ResponseEntity<Civil> findById(Long id) {
        Optional<Civil> civilOptional = CivilService.findById("");
        return new ResponseEntity<Civil>(civil, HttpStatus.OK);
    }
    
    // listar todos os civis pela rota /civis/All
    @GetMapping("/{All}")
    public ResponseEntity<List<Civil>> getAll() {
        return CivilService.getAll();
    }

    // salvando um novo civil
    @PostMapping
    public ResponseEntity<Civil> createCivil(@RequestBody Civil civil) {
        CivilService.save(civil);
        return new ResponseEntity<Civil>(civil, HttpStatus.CREATED);
    }

    // atualizar um civil pelo id
    @PutMapping("/{id}")
    public ResponseEntity<Civil> updateCivil(@PathVariable Long id, @RequestBody Civil civilDetails) {
        Optional<Civil> civilOptional = CivilService.findById(id);
        if (civilOptional.isPresent()) {
            Civil  updateCivil = Civil.get();
            updateCivil.setNome(civilDetails.getNome());
            updateCivil.setEmail(civilDetails.getEmail());
            updateCivil.setContato(civilDetails.getContato());
            return ResponseEntity.ok(CivilService.save(updateCivil));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // deletando um civil pelo id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCivil(@PathVariable Long id) {
        CivilService.deleteCivil(id);
        return ResponseEntity.noContent().build();
    }
}