package dio.restkafka.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegistraEventoService {
    private final KafkaTemplate<Object, Object> template;

    public <T> void adicionarEvento(String topicos, T dados){
        template.send(topicos,dados);}
}
