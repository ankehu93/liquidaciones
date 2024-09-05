package com.ejercicio.liquidaciones.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
public class Name {
    private String nameEmployee;
    public Name(String name) {
        this.nameEmployee = Objects.requireNonNull(name, "Nombre no puede estar vacio");

    }
}