package dio.microservicekafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class MicroServiceKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceKafkaApplication.class, args);
	}

}