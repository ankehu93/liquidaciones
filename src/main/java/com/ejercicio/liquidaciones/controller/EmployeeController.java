package com.ejercicio.liquidaciones.controller;

import com.ejercicio.liquidaciones.model.EmployeeMapper;
import com.ejercicio.liquidaciones.model.exceptions.BusinessException;
import com.ejercicio.liquidaciones.service.EmployeeImplementacion;
import jakarta.validation.Valid;
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

    @PostMapping(value = "/create", consumes = {"text/plain", "application/*"})
    public Mono<EmployeeTO> postEmployee(@Valid @RequestBody EmployeeTO employeeDTO){
        return EmployeeImplementacion.createEmployee(EmployeeMapper.FromEmployeeTO(employeeDTO))
                .doOnError(exc -> Mono.error(new BusinessException("error al crear " + employeeDTO)));
    }
}
