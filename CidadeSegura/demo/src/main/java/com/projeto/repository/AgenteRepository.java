package com.projeto.repository;

import com.projeto.model.Agente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AgenteRepository extends JpaRepository<Agente,Long> {

    // achar o agente pelo Id
    public Agente getById(Long id);

    // listar todos os agentes
    public List<Agente> getAll();

    // salvar o agente
    public void saveAgente(Agente agente);

    // deletar o agente pelo Id
    public void deleteById(Long id);

    // atualizar o agente pelo Id
    public void updateById(Long id);

    // achar o agente pela instituição
    public List<Agente> findByInstituicao(String instituicao);

    // achar o agente pelo nome
    public List<Agente> findByNome(String nome);

    // deletar o agente pelo nome
    public void deleteByNome(String nome);

    // achar o agente pelo email
    public List<Agente> findByEmail(String email);

    // achar o agente pelo cpf
    public List<Agente> findByCpf(String cpf);

    // deletar o agente pelo cpf
    public void deleteByCpf(String cpf);

    
}
