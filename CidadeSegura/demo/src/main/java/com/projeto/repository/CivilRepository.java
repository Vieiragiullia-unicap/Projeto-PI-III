package com.projeto.repository;

import com.projeto.model.Civil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CivilRepository extends JpaRepository<Civil,Long> {

    public Civil getById(Long id);

    public List<Civil> getAll();

    public Civil insertCivil(Civil civil);

    public void deleteById(Long id);

    public void updateById(Long id);
    
}
