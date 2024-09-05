package com.ejercicio.liquidaciones.service;

import com.ejercicio.liquidaciones.controller.EmployeeTO;
import com.ejercicio.liquidaciones.model.Employee;
import com.ejercicio.liquidaciones.model.EmployeeMapper;
import com.ejercicio.liquidaciones.repository.EmployeeRepositoryAdapter;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import java.util.List;

@Service
@Data
@Slf4j
public class EmployeeImplementacion implements EmployeeService{
    private final EmployeeRepositoryAdapter employeeRepositoryAdapter;
    @Override
    public Mono<List<EmployeeTO>> findAllEmployees() {
        return employeeRepositoryAdapter.findAllEmployees().map(EmployeeMapper::EmployeeList);
    }

    @Override
    public Mono<EmployeeTO> createEmployee(Mono<Employee> employeeCre) {
        return employeeCre.flatMap(employee ->
                employeeRepositoryAdapter.saveEmployee(employee)
                        .map(EmployeeMapper::EmployeeCreate));
    }
}
