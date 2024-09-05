package com.ejercicio.liquidaciones.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;


@Data
@NoArgsConstructor
public class DocumentId {
    private Integer documentEnployee;
    public DocumentId(Integer documentId) {
        Objects.requireNonNull(documentId, "El documento no puede estar vacio");
        this.documentEnployee = documentId;
    }


}