package bicicletas.servicioAlquileres.Entities.Dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TarifaDto {
    @Schema(description = "Identificador de la tarifa", example = "1", required = true)
    private long id;

    @Schema(description = "Tipo de la tarifa : 1 - Tarifa Normal, 2 - Tarifa de Descuento", example = "2")
    private Long tipoTarifa;

    @Schema(description = " Definicion de la tarifa ‘S’ - Definida por el día de la semana, ‘C’ definida por día, mes y año"
            , example = "S")
    private String definicion;

    @Schema(description = "Dia de la semana", example = "7")
    private Long diaSemana;

    @Schema(description = "Dia del mes", example = "1")
    private Long diaMes;

    @Schema(description = "Mes", example = "1")
    private Long mes;

    @Schema(description = "Año", example = "1")
    private Long anio;

    @Schema(description = "Monto fijo del Alquiler", example = "100.70")
    private double montoFijoAlquiler;

    @Schema(description= "Monto del minuto extra ", example = "2.25")
    private double montoMinutoFraccion;

    @Schema(description = "Monto por km", example = "250.5")
    private double montoKm;

    @Schema(description = "Monto por hora", example = "300.5")
    private double montoHora;
}
