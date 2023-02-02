package org.springframework.cloud.schema.apicurio.client;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.cloud.schema.registry.client.config.SchemaRegistryClientProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@TestConfiguration
public class ApicurioSchemaRegistryClientTestConfiguration {

    @Bean
    ApicurioSchemaRegistryClient client(RestTemplate restTemplate, SchemaRegistryClientProperties properties) {
        return new ApicurioSchemaRegistryClient(restTemplate, properties);
    }

}
