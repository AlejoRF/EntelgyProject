package com.bbva.prueba.app.model;

import com.bbva.prueba.app.util.Constante;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {

    @JsonProperty("id")
    Integer id;
    @JsonProperty("email")
    String email;
    @JsonProperty("last_name")
    String lastName;


    public String concat() {
        return id + Constante.PALILLO + lastName + Constante.PALILLO + email ;
    }


}
