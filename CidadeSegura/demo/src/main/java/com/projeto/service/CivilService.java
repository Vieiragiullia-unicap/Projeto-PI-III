package com.projeto.service;

//import com.projeto.exception.CivilNotFoundException;
import com.projeto.exception.UserNotFoundException;
import com.projeto.model.Civil;
import com.projeto.repository.CivilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 

import java.util.List;

@Service
public class CivilService {

    @Autowired
    private CivilRepository CivilRepository;

    // metodo para achar civil pelo id
    public Civil getCivilById(Long id) {
        return CivilRepository.getById(id);
    }

    // metodo para listar todos os civis 
    public List<Civil> getCivilList() {
        return CivilRepository.getAll();
    }

    // metodo para salvar civil
    public Civil saveCivil(Civil civil) {
        return CivilRepository.saveCivil(civil);
    }

    // metodo para deletar civil pelo id
    public void deleteCivilById(Long id) {
        CivilRepository.deleteById(id);
    }

    // metodo para atualizar civil pelo id
    public void updateCivilById(Long id) {
        CivilRepository.updateById(id);
    }

    // metodo para achar civil pelo nome
    public List<Civil> getCivilByNome(String nome) {
        return CivilRepository.findByNome(nome);
    }

    // metodo para achar civil pelo cpf
    public List<Civil> getCivilByCpf(String cpf) {
        return CivilRepository.findByCpf(cpf);
    }

    // metodo para deletar civil pelo cpf
    public void deleteCivilByCpf(String cpf) {
        CivilRepository.deleteByCpf(cpf);
    }

    // metodo para achar civil pelo email
    public List<Civil> getCivilByEmail(String email) {
        return CivilRepository.findByEmail(email);
    }

    // metodo para achar civil pelo contato
    public List<Civil> getCivilByContato(String contato) {
        return CivilRepository.findByContato(contato);
    }

}