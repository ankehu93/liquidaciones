package com.ejercicio.liquidaciones.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Position {
    private String positionEmployee;
    public Position(String position) {
        this.positionEmployee = position;
    }
}