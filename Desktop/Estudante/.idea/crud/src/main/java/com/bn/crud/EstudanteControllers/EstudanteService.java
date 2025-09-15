package com.bn.crud.services;


import com.bn.crud.Estudante;
import com.bn.crud.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudanteService {
    @Autowired
    private EstudanteRepository estudanteRepository;
    public List<Estudante> listar(){
        return estudanteRepository.findAll();
    }
    public Estudante criarEstudante(Estudante estudante){
        return  estudanteRepository.save(estudante);
    }

}