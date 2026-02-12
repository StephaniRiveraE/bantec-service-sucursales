package com.arcbank.sucursales.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.Getter;
import lombok.Setter;

@DynamoDBDocument
@Getter
@Setter
public class EntidadBancaria {
    private String nombre;
    private String ruc;
    private String estado;

    public EntidadBancaria() {
    }
}
