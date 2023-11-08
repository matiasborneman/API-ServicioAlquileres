package bicicletas.servicioAlquileres.Entities;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="TARIFAS")
public class Tarifa {

    @Id
    @GeneratedValue(generator = "TARIFAS")
    @TableGenerator(name = "TARIFAS", table = "sqlite_sequence",
            pkColumnName = "name", valueColumnName = "seq",
            pkColumnValue="id",
            initialValue=1, allocationSize=1)
    private long id;

    @Column(name="tipo_tarifa")
    private Long tipoTarifa;

    @Column(name="definicion")
    private String definicion;

    @Column(name="dia_semana")
    private Long diaSemana;

    @Column(name="dia_mes")
    private Long diaMes;

    @Column(name="mes")
    private Long mes;

    @Column(name="anio")
    private Long anio;

    @Column(name="monto_fijo_alquiler")
    private double montoFijoAlquiler;

    @Column(name="monto_minuto_fraccion")
    private double montoMinutoFraccion;

    @Column(name="monto_km")
    private double montoKm;

    @Column(name="monto_hora")
    private double montoHora;
}
