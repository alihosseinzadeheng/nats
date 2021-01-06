package ir.jibit.nats.domain;

import io.nats.client.Connection;
import io.nats.client.Dispatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class Sub1 extends Thread {
    final String subject = "nats.demo.service";
   // final String subject = ">";
    @Autowired
    public Sub1(Connection nats) {

        Dispatcher dispatcher = nats.createDispatcher(msg -> {
        });

        dispatcher.subscribe(subject, msg -> {
            System.out.println("Received By 1: " + new String(msg.getData()) + " ---> " + Instant.now().toString());
        });
    }
}
