package br.com.alphacode.Hexagonal.adapters.in.web;

import br.com.alphacode.Hexagonal.domain.model.Veiculo;
import br.com.alphacode.Hexagonal.domain.pots.in.VeiculoServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/veiculos")

public class VeiculoController {
    //vou injetar a entidade diretamente mas depois sera necessario criar um Dto para o request

    private final VeiculoServicePort veiculoServicePort;

    public VeiculoController(VeiculoServicePort veiculoServicePort) {
        this.veiculoServicePort = veiculoServicePort;
    }

    @PostMapping
    public ResponseEntity<Veiculo> create(@RequestBody Veiculo veiculo) {
        return ResponseEntity.ok(veiculoServicePort.create(veiculo));
    }
}
