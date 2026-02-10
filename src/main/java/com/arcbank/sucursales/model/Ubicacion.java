package com.arcbank.sucursales.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@DynamoDBDocument
@Getter
@Setter
public class Ubicacion {
    private String pais;
    private String provincia;
    private String ciudad;
    private String sector;
    private Integer codigoPostal;

    // Lista simple de feriados (strings ISO date) para DynamoDB
    private List<String> feriados;

    public Ubicacion() {
    }
}
