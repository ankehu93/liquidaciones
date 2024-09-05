package com.ejercicio.liquidaciones.controller;
import jakarta.validation.constraints.*;
import lombok.*;
import java.time.LocalDate;

    @Data
    @Builder(toBuilder = true)
    @AllArgsConstructor
    @NoArgsConstructor
    public class EmployeeTO {

        @Max(15)
        @Min(7)
        @NotNull(message = "El documento no puede estar vacio")
        private Integer documentId;

        @Size(min = 1, max = 30)
        @Pattern(regexp = "^[a-zA-Z]+$")
        @NotNull(message = "El nombre no puede estar vacio")
        private String name;

        @NotNull(message = "la fecha_no puede estar vacia")
        private LocalDate startDate;

        @Max(30)
        @Min(10)
        @Pattern(regexp="^[a-zA-Z]+$")
        private String position;

        @Max(7000000)
        @Min(1300000)
        @NotNull(message = "El salario no puede estar vacio")
        private Integer salary;

}
