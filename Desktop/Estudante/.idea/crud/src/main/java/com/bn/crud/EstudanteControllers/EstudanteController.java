package com.bn.crud.controllers;

import com.bn.crud.EstudanteModel;
import com.bn.crud.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/orders")
public class EstudanteController {


    @Autowired
    private EstudanteService orderService;


    @GetMapping
    public List<EstudanteModel> findAll(){
        return estudanteService.listar();
    }

    @PostMapping
    public EstudanteModel criar( @RequestBody EstudanteModel estudante){
        return estudanteService.criarEstudante(estudante);
    }

}