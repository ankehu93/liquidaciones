package com.ejercicio.liquidaciones.repository;

import com.ejercicio.liquidaciones.model.Employee;
import lombok.Data;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;
import java.util.List;

@Data
@Repository
public class EmployeeRepositoryAdapter {

 private final EmployeRepository employeRepository;
    public Mono<List<Employee>> findAllEmployees() {
        return employeRepository.findAll().map(EmployeeRepositoryMapper::toDomain).collectList();
    }
    public Mono<Employee> saveEmployee(Employee employee) {
        return employeRepository.save(EmployeeRepositoryMapper.toData(employee)).map(EmployeeRepositoryMapper::toDomain);
    }
}
