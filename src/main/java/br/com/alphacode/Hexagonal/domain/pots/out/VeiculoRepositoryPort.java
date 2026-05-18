package br.com.alphacode.Hexagonal.domain.pots.out;

import br.com.alphacode.Hexagonal.domain.model.Veiculo;

public interface VeiculoRepositoryPort {
    Veiculo save(Veiculo veiculo);
}
