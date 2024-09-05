package com.ejercicio.liquidaciones.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.Objects;

@Data
@NoArgsConstructor
public class StartDate {
    private LocalDate startDateEmployee;
    public StartDate(LocalDate startDate) {
        Objects.requireNonNull(startDate, "La fecha de inicio no puede estar vacia");
        this.startDateEmployee = startDate;
    }
}