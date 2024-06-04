package com.projeto.service;

import com.projeto.exception.AgenteNotFoundException;
import com.projeto.model.Agente;
import com.projeto.repository.AgenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 

import java.util.List;
import java.util.Optional;

import javax.security.auth.login.AccountNotFoundException;

@Service
public class AgenteService {

    @Autowired
    private AgenteRepository AgenteRepository;

    // metodo para salvar agente
    public Agente saveAgente(Agente agente) {
        return AgenteRepository.save(agente);
    }

    // metodo para listar todos os agentes
    public List<Agente> getAllAgentes() {
        return AgenteRepository.findAll();
    }

    // metodo para buscar agente por id
    public Agente getAgenteById(Long id) {
        return AgenteRepository.findById(id);
    }

    // metodo para deletar agente por id
    public void deleteAgenteById(Long id) {
        AgenteRepository.deleteById(id);
    }

    // metodo para buscar agente pela instituição 
    public List<Agente> getAgenteByInstituicao(String instituicao) {
        return AgenteRepository.findByInstituicao(instituicao);
    }
}