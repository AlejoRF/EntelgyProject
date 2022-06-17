package com.bbva.prueba.app;

import com.bbva.prueba.app.controller.DataController;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class BbvaTestApplicationTests {

    @Autowired
    DataController dataController;

    @Test
    public void listarDataTest() {
        List<String> listarDatos = dataController.listarData();
        Assert.assertNotNull(listarDatos);
        System.out.println(listarDatos);
    }

}
