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

    // Sobreescritura para devolver List en lugar de Iterable
    @Override
    List<Sucursal> findAll();

    // Métodos anidados soportados por Spring Data
    List<Sucursal> findByUbicacion_Provincia_Nombre(String nombre);

    List<Sucursal> findByUbicacion_Canton_Nombre(String nombre);

    List<Sucursal> findByUbicacion_Parroquia_Nombre(String nombre);
}
