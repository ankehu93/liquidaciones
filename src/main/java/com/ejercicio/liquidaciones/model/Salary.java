package com.ejercicio.liquidaciones.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Objects;
    @Data
    @NoArgsConstructor
    public class Salary {
        private Integer salaryEmployee;
        public Salary(Integer salary) {
            Objects.requireNonNull(salary, "El salario no puede estar vacio");
            this.salaryEmployee = salary;
        }
    }
