package com.ejercicio.liquidaciones.repository;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.io.Serializable;

@Getter
@Builder(toBuilder = true)
@Document(collection = "employee")
public class EmployeeData implements Serializable {

    @Id
    private String id;
    @Field("document")
    private Integer document;

    @Field("nombre")
    private String name;
    @Field("fecha_inicio")
    private String startDate;
    @Field("cargo")
    private String position;
    @Field("salario")
    private Integer salary;

    public EmployeeData(String id, Integer document, String name, String startDate, String position, Integer salary) {
        this.id = id;
        this.document = document;
        this.name = name;
        this.startDate = startDate;
        this.position = position;
        this.salary = salary;
    }

}