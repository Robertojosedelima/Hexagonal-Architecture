package br.com.alphacode.Hexagonal.domain.services;

import br.com.alphacode.Hexagonal.domain.model.Veiculo;
import br.com.alphacode.Hexagonal.domain.pots.in.VeiculoServicePort;
import br.com.alphacode.Hexagonal.domain.pots.out.VeiculoRepositoryPort;

public class VeiculoServiceAdapter implements VeiculoServicePort {
    
    private final VeiculoRepositoryPort veiculoRepositoryPort;

    public VeiculoServiceAdapter(VeiculoRepositoryPort veiculoRepositoryPort) {
        this.veiculoRepositoryPort = veiculoRepositoryPort;
    }

    @Override
    public Veiculo create(Veiculo veiculo) {
        return veiculoRepositoryPort.save(veiculo);
    }
}
