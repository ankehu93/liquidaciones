package com.ejercicio.liquidaciones.model;

import com.ejercicio.liquidaciones.controller.EmployeeTO;
import reactor.core.publisher.Mono;

import java.util.List;

public class EmployeeMapper {

    public static List<EmployeeTO> EmployeeList(List<Employee> employeeList){
        return employeeList.stream().map(employee ->
                        EmployeeTO.builder().documentId(employee.getDocument().getDocumentEnployee())
                                .name(employee.getName().getNameEmployee())
                                .startDate(employee.getStartDate().getStartDateEmployee())
                                .position(employee.getPosition().getPositionEmployee())
                                .salary(employee.getSalary().getSalaryEmployee())
                                .build())
                .toList();
    }

    public static EmployeeTO EmployeeCreate(Employee employee){
        return EmployeeTO.builder().documentId(employee.getDocument().getDocumentEnployee())
                .name(employee.getName().getNameEmployee())
                .startDate(employee.getStartDate().getStartDateEmployee())
                .position(employee.getPosition().getPositionEmployee())
                .salary(employee.getSalary().getSalaryEmployee())
                .build();
    }

}
