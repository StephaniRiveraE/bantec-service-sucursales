package com.arcbank.sucursales.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.Getter;
import lombok.Setter;
import com.amazonaws.services.dynamodbv2.datamodeling.*;

import java.util.List;

@DynamoDBDocument
@Getter
@Setter
@DynamoDBDocument
public class FeriadosPorNivel {

    @DynamoDBAttribute
    private List<Feriado> provincia;
    @DynamoDBAttribute
    private List<Feriado> canton;
    @DynamoDBAttribute
    private List<Feriado> parroquia;

    public FeriadosPorNivel() {
    }

    @Override
    public String toString() {
        return "FeriadosPorNivel{" +
                "provincia=" + provincia +
                ", canton=" + canton +
                ", parroquia=" + parroquia +
                '}';
    }
}
