package com.ejercicio.liquidaciones.controller;

import com.ejercicio.liquidaciones.model.exceptions.BusinessException;
import com.ejercicio.liquidaciones.service.EmployeeImplementacion;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping( value = "/api/employee")
public class EmployeeController {
    @Autowired
    private final EmployeeImplementacion EmployeeImplementacion;

    @GetMapping(value = "/list", consumes = {"text/plain", "application/*"})
    public Mono<List<EmployeeTO>> employees() {
        return EmployeeImplementacion.findAllEmployees()
                .switchIfEmpty(Mono.error(new BusinessException("No se encontraron empleados")));
    }
}
