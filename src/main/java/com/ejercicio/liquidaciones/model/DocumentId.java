package com.ejercicio.liquidaciones.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;


@Data
@NoArgsConstructor
public class DocumentId {
    private Integer documentEmployee;
    public DocumentId(Integer documentId) {
        this.documentEmployee =  Objects.requireNonNull(documentId, "El documento no puede estar vacio");
    }
}