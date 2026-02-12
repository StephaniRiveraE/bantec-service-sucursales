package com.arcbank.sucursales.repository;

import com.arcbank.sucursales.model.Sucursal;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
<<<<<<< Updated upstream
import org.springframework.stereotype.Repository;
=======
>>>>>>> Stashed changes

import java.util.List;
import java.util.Optional;

<<<<<<< Updated upstream
@Repository
=======
>>>>>>> Stashed changes
@EnableScan
public interface SucursalRepository extends CrudRepository<Sucursal, String> {

    Optional<Sucursal> findByCodigoUnico(String codigoUnico);

<<<<<<< Updated upstream
    // Sobreescritura para devolver List en lugar de Iterable
=======
>>>>>>> Stashed changes
    @Override
    List<Sucursal> findAll();

    // Métodos anidados soportados por Spring Data
    List<Sucursal> findByUbicacion_Provincia_Nombre(String nombre);

<<<<<<< Updated upstream
    List<Sucursal> findByUbicacion_Canton_Nombre(String nombre);

    List<Sucursal> findByUbicacion_Parroquia_Nombre(String nombre);
=======
    List<Sucursal> findByUbicacion_Canton_Nombre(String canton);

    List<Sucursal> findByUbicacion_Parroquia_Nombre(String parroquia);
>>>>>>> Stashed changes
}
