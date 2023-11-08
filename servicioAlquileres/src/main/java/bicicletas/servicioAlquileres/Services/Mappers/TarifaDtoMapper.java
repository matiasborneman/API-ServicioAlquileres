package bicicletas.servicioAlquileres.Services.Mappers;

import bicicletas.servicioAlquileres.Entities.Dto.TarifaDto;
import bicicletas.servicioAlquileres.Entities.Tarifa;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class TarifaDtoMapper implements Function<Tarifa, TarifaDto> {
    @Override
    public TarifaDto apply(Tarifa tarifa){
        return new TarifaDto(
                tarifa.getId(),
                tarifa.getTipoTarifa(),
                tarifa.getDefinicion(),
                tarifa.getDiaSemana(),
                tarifa.getDiaMes(),
                tarifa.getMes(),
                tarifa.getAnio(),
                tarifa.getMontoFijoAlquiler(),
                tarifa.getMontoMinutoFraccion(),
                tarifa.getMontoKm(),
                tarifa.getMontoHora()
        );
    }
}
