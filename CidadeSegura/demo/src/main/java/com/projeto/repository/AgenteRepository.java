package com.projeto.repository;

import com.projeto.model.Agente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AgenteRepository extends JpaRepository<Agente,Long> {

    public Agente getById(Long id);

    public List<Agente> getAll();

    public void insertAgente(Agente agente);

    public void deleteById(Long id);

    public void updateById(Long id);

    public Optional<Agente> findById(String id);
    
}
