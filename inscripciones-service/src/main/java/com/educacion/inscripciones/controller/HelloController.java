package com.educacion.inscripciones.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/inscripciones/hello")
    public String hello() {
        return "¡Bienvenido al Servicio de Inscripciones!";
    }

}
