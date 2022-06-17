package com.bbva.prueba.app.service.impl;

import com.bbva.prueba.app.model.Data;
import com.bbva.prueba.app.model.Result;
import com.bbva.prueba.app.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service("DataService")
public class DataServiceImpl implements DataService {

    @Value("${config.spring.api}")
    private String baseUrl;

    private final RestTemplate restTemplate;

    @Autowired
    public DataServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<String> listarData() {
        List<String> resultado;
        Result listadoDatos = restTemplate.getForObject(baseUrl, Result.class);
        resultado = listarDataFormat(listadoDatos.getData());
        return resultado;
    }

    @Override
    public List<String> listarDataFormat(List<Data> dataList) {
        List<String> newFormat = dataList.stream().map(Data::concat).collect(Collectors.toList());
        return newFormat;
    }
}
