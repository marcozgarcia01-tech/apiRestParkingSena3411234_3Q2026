package com.sena.parqueadero.repository;

import java.util.Optional;

import org.springframework.data.repository.reactive.RxJava3CrudRepository;

import com.sena.parqueadero.model.Tarifa;
import com.sena.parqueadero.model.TipoVehiculo;

public interface ITarifaRepository extends RxJava3CrudRepository<Tarifa, Long> {
	
	Optional<Tarifa> findByTipoVehiculo(TipoVehiculo tipoVehiculo);
	

}
