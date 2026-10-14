package br.com.infoa.backend.senai.empreendedor.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Nova Grecia",
        version = "1.0",
        description = "API para o sistema Nova Grecia. cursos - estudos - conhecimento"
    )
)
public class Swagger {

}