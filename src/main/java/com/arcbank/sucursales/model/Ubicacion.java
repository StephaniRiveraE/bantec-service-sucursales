package com.arcbank.sucursales.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.Getter;
import lombok.Setter;

@DynamoDBDocument
@Getter
@Setter
public class Ubicacion {

    @DynamoDBAttribute
    private NivelUbicacion pais;

    @DynamoDBAttribute
    private NivelUbicacion provincia;

    @DynamoDBAttribute
    private NivelUbicacion canton;

    @DynamoDBAttribute
    private NivelUbicacion parroquia;

    @DynamoDBAttribute
    private String sector;

    @DynamoDBAttribute
    private Integer codigoPostal;

    @DynamoDBAttribute
    private FeriadosPorNivel feriados;

    public Ubicacion() {
    }
}
