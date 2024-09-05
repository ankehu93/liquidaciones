package com.ejercicio.liquidaciones.model;

import com.ejercicio.liquidaciones.model.exceptions.BusinessException;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.Objects;

@Data
@NoArgsConstructor
public class StartDate {
    private LocalDate startDateEmployee;
    public StartDate(LocalDate startDate) {
        this.startDateEmployee = Objects.requireNonNull(startDate, "La fecha de inicio no puede estar vacia");
    }

}