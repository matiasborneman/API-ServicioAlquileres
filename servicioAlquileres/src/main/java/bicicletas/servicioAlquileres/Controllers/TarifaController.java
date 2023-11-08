package bicicletas.servicioAlquileres.Controllers;

import bicicletas.servicioAlquileres.Entities.Dto.TarifaDto;
import bicicletas.servicioAlquileres.Services.TarifaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name="Tarifas", description = "Catalogo de Tarifas")
@RequestMapping("/tarifa")
public class TarifaController {
    private TarifaService tarifaService;
    public TarifaController(TarifaService tarifaService) {
        this.tarifaService = tarifaService;
    }

    @GetMapping
    @Operation(summary = "Obtiene el listado de Tarifas")
    public ResponseEntity<List<TarifaDto>> getAll() {
        List<TarifaDto> values = this.tarifaService.getAll();
        return ResponseEntity.ok(values);
    }

    @PostMapping
    @Operation(summary = "Registra una nueva tarifa")
    /*@ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Se registra la tarifa", content = @Content(schema = @Schema(implementation = Estacion.class)))
    })**/
    public ResponseEntity<TarifaDto> add(@RequestBody TarifaDto tarifaDto) {
        TarifaDto tarifa =  this.tarifaService.add(tarifaDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(tarifa);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtiene una tarifa determinada")
    /*@ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Existe la Tarifa", content = @Content(schema = @Schema(implementation = Tarifa.class))),
            @ApiResponse(responseCode = "404", description = "La tarifa no existe", content = @Content(schema = @Schema(implementation = Response.class)))
    })**/
    public ResponseEntity<TarifaDto> getById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.tarifaService.getById(id));
    }
}
