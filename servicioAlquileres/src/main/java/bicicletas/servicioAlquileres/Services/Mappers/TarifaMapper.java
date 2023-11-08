package bicicletas.servicioAlquileres.Services.Mappers;

import bicicletas.servicioAlquileres.Entities.Dto.TarifaDto;
import bicicletas.servicioAlquileres.Entities.Tarifa;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class TarifaMapper implements Function<TarifaDto, Tarifa> {
    public Tarifa apply(TarifaDto tarifaDto){
        return new Tarifa(
                tarifaDto.getId(),
                tarifaDto.getTipoTarifa(),
                tarifaDto.getDefinicion(),
                tarifaDto.getDiaSemana(),
                tarifaDto.getDiaMes(),
                tarifaDto.getMes(),
                tarifaDto.getAnio(),
                tarifaDto.getMontoFijoAlquiler(),
                tarifaDto.getMontoMinutoFraccion(),
                tarifaDto.getMontoKm(),
                tarifaDto.getMontoHora()
        );
    }
}
