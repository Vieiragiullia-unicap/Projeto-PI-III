package com.projeto.controller;

import com.projeto.exception.IncidenteNotFoundException;
import com.projeto.model.Incidente;
import com.projeto.service.IncidenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//import javax.management.RuntimeErrorException;

@RestController
@RequestMapping("/incidentes")
public class IncidenteController {

    @Autowired
    private IncidenteService incidenteService;
    @PostMapping
    public ResponseEntity<Incidente> saveIncidente(@RequestBody Incidente incidente) {
       Incidente incidenteSalvo = incidenteService.saveIncidente(incidente);
        return new ResponseEntity<>(incidenteSalvo, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Incidente>> findAll() {
        List<Incidente> incidentes = incidenteService.findAll();
        return new ResponseEntity<>(incidentes, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Incidente> findById(@PathVariable Long id) {
        try {
            Incidente incidente = incidenteService.findById(id);
            return new ResponseEntity<>(incidente, HttpStatus.OK);
        } catch (IncidenteNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/gravidade/{gravidade}")
    public List<Incidente> findByGravidade(@PathVariable String gravidade) {
        return incidenteService.findByGravidade(gravidade);
    }
    @GetMapping("/civil/{civil}")
    public List<Incidente> FindByCivil(@PathVariable String civil) {
        return incidenteService.FindByCivil(civil);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteIncidente(@PathVariable Long id) throws IncidenteNotFoundException {
        incidenteService.deleteIncidente(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    /* ou tratar a exceção diretamente:
    *
    public ResponseEntity<Void> deleteIncidente(@PathVariable Long id) {
    try {
        incidenteService.deleteIncidente(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    } catch (IncidenteNotFoundException e) {
        // Tratar a exceção aqui, se necessário
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    */
}  