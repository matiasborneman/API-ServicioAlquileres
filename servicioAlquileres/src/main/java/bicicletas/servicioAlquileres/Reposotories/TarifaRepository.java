package bicicletas.servicioAlquileres.Reposotories;

import bicicletas.servicioAlquileres.Entities.Tarifa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarifaRepository extends JpaRepository<Tarifa,Long> {
}
