package controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ListController {
    
    @GetMapping
    public List<Estacionado> findAll() {

        var Estacionado = new Estacionado();
        Estacionado.setcolor("Preto");
        Estacionado.setLicense("MSS-1111");
        Estacionado.setModel("Honda Civic");
        Estacionado.setState("SP");
        return Arrays.asList(Estacionado, Estacionado);
    }
}
