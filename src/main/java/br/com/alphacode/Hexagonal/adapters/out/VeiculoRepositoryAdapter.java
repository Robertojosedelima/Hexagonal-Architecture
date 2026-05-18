package br.com.alphacode.Hexagonal.adapters.out;

import br.com.alphacode.Hexagonal.domain.model.Veiculo;
import br.com.alphacode.Hexagonal.domain.pots.out.VeiculoRepositoryPort;
import org.springframework.stereotype.Component;

@Component
public class VeiculoRepositoryAdapter implements VeiculoRepositoryPort {
    @Override
    public Veiculo save(Veiculo veiculo) {
        return veiculo;
    }
}
