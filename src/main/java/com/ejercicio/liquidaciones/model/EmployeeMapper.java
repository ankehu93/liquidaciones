package com.ejercicio.liquidaciones.model;

import com.ejercicio.liquidaciones.controller.EmployeeTO;
import reactor.core.publisher.Mono;

import java.util.List;

public class EmployeeMapper {

    public static List<EmployeeTO> EmployeeList(List<Employee> employeeList){
        return employeeList.stream().map(employee ->
                        EmployeeTO.builder().document(employee.getDocument().getDocumentEmployee())
                                .name(employee.getName().getNameEmployee())
                                .startDate(employee.getStartDate().getStartDateEmployee())
                                .position(employee.getPosition().getPositionEmployee())
                                .salary(employee.getSalary().getSalaryEmployee())
                                .build())
                .toList();
    }

    public static EmployeeTO EmployeeCreate(Employee employee){
        return EmployeeTO.builder()
                .document(employee.getDocument().getDocumentEmployee())
                .name(employee.getName().getNameEmployee())
                .startDate(employee.getStartDate().getStartDateEmployee())
                .position(employee.getPosition().getPositionEmployee())
                .salary(employee.getSalary().getSalaryEmployee())
                .build();
    }

    public static Mono<Employee> FromEmployeeTO(EmployeeTO employeeTO){
        return Mono.just(Employee.builder()
                .document(new DocumentId(employeeTO.getDocument()))
                .name(new Name(employeeTO.getName()))
                .startDate(new StartDate(employeeTO.getStartDate()))
                .position(new Position(employeeTO.getPosition()))
                .salary(new Salary(employeeTO.getSalary()))
                .build());
    }

}
