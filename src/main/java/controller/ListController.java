package controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ListController {
    
    @GetMapping
    public ResponseEntity<Object> findAll(Object Result) {

        var Estacionado = new Estacionado();
        Estacionado.setcolor("Preto");
        Estacionado.setLicense("MSS-1111");
        Estacionado.setModel("Honda Civic");
        Estacionado.setState("SP");
        return ResponseEntity.ok(Result);
    }
}
