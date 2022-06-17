package com.bbva.prueba.app.service;

import com.bbva.prueba.app.model.Data;

import java.util.List;

public interface DataService {
    List<String> listarData();
    List<String> listarDataFormat(List<Data> dataList);
}
