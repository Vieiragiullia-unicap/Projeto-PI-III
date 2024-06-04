package com.projeto.service;

//import com.projeto.exception.IncidenteNotFoundException;
import com.projeto.model.Incidente;
import com.projeto.repository.IncidenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 
import java.util.List;
import com.projeto.model.Incidente;

@Service
public class IncidenteService {

    @Autowired
    private IncidenteRepository incidenteRepository;

    // metodo para achar incidente pelo id
    public Incidente getIncidenteById(Long id) {
        return incidenteRepository.getById(id);
    }

    // metodo para listar todos os incidentes
    public List<Incidente> getIncidenteList() {
        return incidenteRepository.getAll();
    }

    // metodo para salvar incidente
    public Incidente saveIncidente(Incidente incidente) {
        return incidenteRepository.saveIncidente(incidente);
    }

    // metodo para deletar incidente pelo id
    public void deleteIncidenteById(Long id) {
        incidenteRepository.deleteById(id);
    }

    // metodo para atualizar incidente pelo id
    public void updateIncidenteById(Long id) {
        incidenteRepository.updateById(id);
    }

    // metodo para achar incidente pela gravidade
    public List<Incidente> getIncidenteByGravidade(String gravidade) {
        return incidenteRepository.findByGravidade(gravidade);
    }

    // metodo para achar incidente pelo tipo de incidente
    public List<Incidente> getIncidenteByTipoIncidente(String tipoIncidente) {
        return incidenteRepository.findByTipoIncidente(tipoIncidente);
    }

    // metodo para achar incidente pela data
    public List<Incidente> getIncidenteByData(String data) {
        return incidenteRepository.findByData(data);
    }

    // metodo para achar incidente pelo endereço
    public List<Incidente> getIncidenteByEndereco(String endereco) {
        return incidenteRepository.findByEndereco(endereco);
    }

}