package com.ejercicio.liquidaciones.service;

import com.ejercicio.liquidaciones.controller.EmployeeTO;
import com.ejercicio.liquidaciones.model.Employee;
import reactor.core.publisher.Mono;
import java.util.List;

public interface EmployeeService {
    Mono<List<EmployeeTO>> findAllEmployees();
    Mono<EmployeeTO> createEmployee(Mono<Employee> employee);

}