package ir.jibit.nats;

import io.nats.client.Connection;
import io.nats.client.Nats;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

@Slf4j
@SpringBootApplication
public class NatsApplication {

    public static void main(String[] args) {
        SpringApplication.run(NatsApplication.class, args);
    }

    @Bean
    Connection tt() throws IOException, InterruptedException {
        return Nats.connect();
    }
}
