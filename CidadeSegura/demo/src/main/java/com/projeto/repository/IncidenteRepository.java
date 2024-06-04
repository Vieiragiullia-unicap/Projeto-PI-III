package com.projeto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.model.Incidente;

@Repository
public interface IncidenteRepository extends JpaRepository<Incidente, Long> {

    // achar o incidente pelo Id
    public Incidente getById(Long id);

    // listar todos os incidentes
    public List<Incidente> getAll();

    // salvar o incidente
    public Incidente saveIncidente(Incidente incidente);

    // deletar o incidente
    public void deleteById(Long id);

    // atualiza o incident
    public void updateById(Long id);

    // achar o incidente pela gravidade
    public List<Incidente> findByGravidade(String gravidade);

    // achar o incidente pelo tipo de incidente
    public List<Incidente> findByTipoIncidente(String tipoIncidente);

    // achar o incidente pela data
    public List<Incidente> findByData(String data);

    // achar o incidente pelo endereço
    public List<Incidente> findByEndereco(String endereco);
}

