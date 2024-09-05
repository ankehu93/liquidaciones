package com.ejercicio.liquidaciones.repository;

import com.ejercicio.liquidaciones.model.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EmployeeRepositoryMapper {
    private static final DateTimeFormatter DB_FORMATTER = DateTimeFormatter.ofPattern("yyyy/dd/MM");
    public static Employee toDomain(EmployeeData employeeData) {
        return Employee.builder()
                .document(new DocumentId(employeeData.getDocument()))
                .name(new Name(employeeData.getName()))
                .startDate(new StartDate(toLocalDate(employeeData.getStartDate())))
                .position(new Position(employeeData.getPosition()))
                .salary(new Salary(employeeData.getSalary()))
                .build();
    }

    public static EmployeeData toData(Employee employee) {
        return EmployeeData.builder()
                .document(employee.getDocument().getDocumentEmployee())
                .name(employee.getName().getNameEmployee())
                .startDate(toDatabaseFormat(employee.getStartDate().getStartDateEmployee()))
                .position(employee.getPosition().getPositionEmployee())
                .salary(employee.getSalary().getSalaryEmployee())
                .build();
    }

    public static String toDatabaseFormat(LocalDate startDate) {
        return startDate.format(DB_FORMATTER);
    }

    public static LocalDate toLocalDate(String stringYYYYddMM) {
        return LocalDate.parse(stringYYYYddMM, DB_FORMATTER);
    }

}
