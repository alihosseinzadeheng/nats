package ir.jibit.nats.domain;

import io.nats.client.Connection;
import io.nats.client.Dispatcher;
import io.nats.client.Nats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.time.Instant;

@Component
public class Sub2 extends Thread {
    final String subject = "nats.demo.service";

    @Autowired
    public Sub2(Connection nats) {

        Dispatcher dispatcher = nats.createDispatcher(msg -> {
        });

        dispatcher.subscribe(subject, msg -> {
            System.out.println("Received By 2: " + new String(msg.getData()) + " ---> " + Instant.now().toString());
        });
    }
}
