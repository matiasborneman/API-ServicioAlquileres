package bicicletas.servicioAlquileres.Services;

import bicicletas.servicioAlquileres.Entities.Dto.TarifaDto;
import bicicletas.servicioAlquileres.Entities.Tarifa;
import bicicletas.servicioAlquileres.Reposotories.TarifaRepository;
import bicicletas.servicioAlquileres.Services.Mappers.TarifaDtoMapper;
import bicicletas.servicioAlquileres.Services.Mappers.TarifaMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class TarifaServiceImpl implements TarifaService {

    private final TarifaRepository tarifaRepository;
    private final TarifaDtoMapper dtoMapper;
    private final TarifaMapper entityMapper;


    public TarifaServiceImpl(TarifaRepository estacionRepository,
                               TarifaDtoMapper mapper,
                               TarifaMapper entityMapper) {
        this.tarifaRepository = estacionRepository;
        this.dtoMapper = mapper;
        this.entityMapper = entityMapper;
    }

    @Override
    public TarifaDto add(TarifaDto entity) {
        Optional<Tarifa> tarifa = Stream.of(entity).map(entityMapper).findFirst();
        this.tarifaRepository.save(tarifa.get());
        return tarifa.map(dtoMapper).orElseThrow();
    }

    @Override
    public TarifaDto update(TarifaDto entity) {
        Optional<Tarifa> tarifa = Stream.of(entity).map(entityMapper).findFirst();
        tarifa.ifPresent(tarifaRepository::save);
        return tarifa.map(dtoMapper).orElseThrow();
    }

    @Override
    public TarifaDto delete(Long id) {
        TarifaDto tarifa = this.getById(id);
        if (tarifa != null) {
            Optional<Tarifa> entity = Stream.of(tarifa).map(entityMapper).findFirst();
            entity.ifPresent(tarifaRepository::delete);
        }
        return tarifa;
    }

    @Override
    public TarifaDto getById(Long id) {
        Optional<Tarifa> tarifa = this.tarifaRepository.findById(id);
        return tarifa.map(dtoMapper).orElseThrow();
    }

    @Override
    public List<TarifaDto> getAll(){
        List<Tarifa> tarifas = this.tarifaRepository.findAll();
        return tarifas
                .stream()
                .map(dtoMapper)
                .toList();
    }
}
