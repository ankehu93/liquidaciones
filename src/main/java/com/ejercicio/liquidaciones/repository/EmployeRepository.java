package com.ejercicio.liquidaciones.repository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface EmployeRepository  extends ReactiveMongoRepository<EmployeeData, String> {
}
