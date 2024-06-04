package com.projeto.repository;

import com.projeto.model.Civil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CivilRepository extends JpaRepository<Civil,Long> {

    // achar o civil pelo Id
    public Civil getById(Long id);

    // listar todos os civis
    public List<Civil> getAll();

    // salvar o civil
    public Civil saveCivil(Civil civil);

    // deletar o civil pelo Id
    public void deleteById(Long id);

    // atualizar o civil pelo Id
    public void updateById(Long id);

    // achar o civil pelo nome
    public List<Civil> findByNome(String nome);

    // achar o civil pelo cpf
    public List<Civil> findByCpf(String cpf);

    // deletar o civil pelo cpf
    public void deleteByCpf(String cpf);

    // achar o civil pelo email
    public List<Civil> findByEmail(String email);

    // achar o civil pelo contato
    public List<Civil> findByContato(String contato);
    
}
