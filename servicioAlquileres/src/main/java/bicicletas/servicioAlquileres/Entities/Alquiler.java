package bicicletas.servicioAlquileres.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="ALQUILERES")
public class Alquiler {
    @Id
    private long id;

    @Column(name="estado")
    private long estado;

    @Column(name = "fecha_hora_devolucion")
    private LocalDateTime fechaHoraDevolucion;

    @Column(name = "fecha_hora_retiro")
    private LocalDateTime fechaHoraRetiro;

    @Column(name="id_cliente")
    private String idCliente;

    @Column(name = "monto")
    private double monto;


}
