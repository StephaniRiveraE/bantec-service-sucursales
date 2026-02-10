package com.arcbank.sucursales.repository;

import com.arcbank.sucursales.model.Sucursal;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@EnableScan
public interface SucursalRepository extends CrudRepository<Sucursal, String> {

    Optional<Sucursal> findByCodigoUnico(String codigoUnico);

    // Métodos adaptados al modelo plano de Ubicacion para DynamoDB
    List<Sucursal> findByUbicacionProvincia(String provincia);

    List<Sucursal> findByUbicacionCiudad(String ciudad);

    List<Sucursal> findByUbicacionSector(String sector);
}
