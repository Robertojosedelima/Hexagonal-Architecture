package br.com.alphacode.Hexagonal.config;

import br.com.alphacode.Hexagonal.domain.pots.in.VeiculoServicePort;
import br.com.alphacode.Hexagonal.domain.pots.out.VeiculoRepositoryPort;
import br.com.alphacode.Hexagonal.domain.services.VeiculoServiceAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public VeiculoServicePort veiculoServicePort(VeiculoRepositoryPort veiculoRepositoryPort) {
        return new VeiculoServiceAdapter(veiculoRepositoryPort);
    }
}
