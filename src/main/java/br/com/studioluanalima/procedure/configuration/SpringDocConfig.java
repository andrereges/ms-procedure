package br.com.studioluanalima.procedure.configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class SpringDocConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(
                  new Info()
                          .title("Microserviço de Procedimento - Studio Luana Lima")
                          .version("v1.0.0")
                          .description("Responssável por gerenciar procedimentos")
                          .license(
                                  new License()
                                          .name("Apache 2.0")
                                          .url("https://springdoc.org")
                          )
                )
                .externalDocs(
                        new ExternalDocumentation()
                                .description("Repositório do Projeto")
                                .url("https://git-codecommit.us-east-1.amazonaws.com/v1/repos/procedure")
                )
                .tags(
                        Arrays.asList(
                                new Tag().name("Procedure")
                        )
                );
    }

}
