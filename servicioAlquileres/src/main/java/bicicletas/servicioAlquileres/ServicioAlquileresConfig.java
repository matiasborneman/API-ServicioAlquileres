package bicicletas.servicioAlquileres;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServicioAlquileresConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info().title("Servicio de Alquileres API")
                        .description("Microservicio API REST de Alquileres para el TPI")
                        .version("1.0"));
    }
}
