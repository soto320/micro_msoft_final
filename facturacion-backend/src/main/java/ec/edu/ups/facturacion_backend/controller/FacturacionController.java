package ec.edu.ups.facturacion_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FacturacionController {

    @GetMapping("/status")
    public String status() {
        return "Application is running!";
    }
}