package br.com.alphacode.Hexagonal.domain.pots.in;

import br.com.alphacode.Hexagonal.domain.model.Veiculo;

public interface VeiculoServicePort {
    Veiculo create(Veiculo veiculo);
}
