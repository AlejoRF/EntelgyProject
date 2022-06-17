package com.bbva.prueba.app;

import com.bbva.prueba.app.service.DataService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class ServiceTest {
    @Mock
    DataService dataService;

    @Test
    public void listarDataTest(){
        List<String> datos = new ArrayList<>();
        datos.add("Id");
        datos.add("Apellido");
        datos.add("Email");

        Mockito.when(dataService.listarData()).thenReturn(datos);
        List<String> list = dataService.listarData();
        System.out.println(list);
    }
}
