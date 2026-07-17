package com.sena.parqueadero.repository;

import java.awt.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.parqueadero.model.Registro;
import com.sena.parqueadero.model.TipoVehiculo;

public interface IRegistroRepositoy extends JpaRepository<Registro, Long> {

	Optional<Registro> findByVehiculoPlacaAndActivoTrue(String placa);

	java.util.List<Registro> findByActivoTrue();

	boolean existByVehiculoIdVehiculo(Long VehiculoId);

	boolean existByVehiculoTipo(TipoVehiculo tipoVehiculo);
	

}
