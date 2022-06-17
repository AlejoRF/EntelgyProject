package com.bbva.prueba.app.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Result {
    @JsonProperty("data")
    List<Data> data;

    public List<Data> getData() {
        return data;
    }
}
