package com.bbva.prueba.app.controller;

import com.bbva.prueba.app.service.impl.DataServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RequestMapping("/prueba")
@RestController
public class DataController {

    @Autowired
    DataServiceImpl dataServiceImpl;

    @PostMapping(value = "/listar", produces = "application/json")
    public List<String> listarData() {
        List<String> resultado = dataServiceImpl.listarData();
        return resultado;

    }




}
