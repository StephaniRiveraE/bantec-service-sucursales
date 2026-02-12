package com.arcbank.sucursales.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@DynamoDBDocument
@Getter
@Setter
public class FeriadosPorNivel {

    private List<Feriado> provincia;
    private List<Feriado> canton;
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
