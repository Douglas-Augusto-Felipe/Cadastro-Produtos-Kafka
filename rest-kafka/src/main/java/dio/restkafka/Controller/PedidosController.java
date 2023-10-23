package dio.restkafka.Controller;

import dio.restkafka.Data.PedidoData;
import dio.restkafka.Service.RegistraEventoService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PedidosController {

    private final RegistraEventoService eventosService;
    @PostMapping(path = "/api/salva-pedido")
    public ResponseEntity<String> salvarPedido(@RequestBody PedidoData pedido){
        eventosService.adicionarEvento("SalvarPedido", pedido);
        return ResponseEntity.ok("Sucesso");
    }
}