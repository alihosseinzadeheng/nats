package ir.jibit.nats.domain;

import io.nats.client.Connection;
import io.nats.client.Dispatcher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Slf4j
@Component
public class Sub3 extends Thread {
    final String subject = "nats.demo.service";

    @Autowired
    public Sub3(@Qualifier("natscn") Connection nats) {
        Dispatcher dispatcher = nats.createDispatcher(msg -> {
        });

        dispatcher.subscribe(subject, msg -> {
            System.out.println("Received_By_3: " + new String(msg.getData()) + " ---> " + Instant.now().toString());
        });
    }
}
