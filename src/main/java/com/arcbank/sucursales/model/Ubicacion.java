package com.arcbank.sucursales.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.Getter;
import lombok.Setter;
import com.amazonaws.services.dynamodbv2.datamodeling.*;

@DynamoDBDocument
@Getter
@Setter
@DynamoDBDocument
public class Ubicacion {

    @DynamoDBAttribute
<<<<<<< Updated upstream
    private NivelUbicacion pais;

    @DynamoDBAttribute
    private NivelUbicacion provincia;

    @DynamoDBAttribute
    private NivelUbicacion canton;

=======
    private NivelUbicacion provincia;
    @DynamoDBAttribute
    private NivelUbicacion canton;
>>>>>>> Stashed changes
    @DynamoDBAttribute
    private NivelUbicacion parroquia;

    @DynamoDBAttribute
<<<<<<< Updated upstream
    private String sector;

    @DynamoDBAttribute
    private Integer codigoPostal;

    @DynamoDBAttribute
    private FeriadosPorNivel feriados;

    public Ubicacion() {
=======
    private FeriadosPorNivel feriados;

    public Ubicacion() {
    }

    @Override
    public String toString() {
        return "Ubicacion{" +
                "provincia=" + provincia +
                ", canton=" + canton +
                ", parroquia=" + parroquia +
                ", feriados=" + feriados +
                '}';
>>>>>>> Stashed changes
    }
}
