package com.ejercicio.liquidaciones.model;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Employee {

    private DocumentId document;
    private Name name;
    private StartDate startDate;
    private Position position;
    private Salary salary;
}
