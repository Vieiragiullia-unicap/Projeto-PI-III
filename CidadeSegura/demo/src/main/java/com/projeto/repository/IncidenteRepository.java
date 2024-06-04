package com.projeto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.model.Incidente;

@Repository
public interface IncidenteRepository extends JpaRepository<Incidente, Long> {

    public Incidente getById(Long id);

    public List<Incidente> getAll();

    public void deleteById(Long id);

    public void updateById(Long id);

    public List<Incidente> findByGravidade(String gravidade);
}

