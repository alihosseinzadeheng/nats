package ir.jibit.nats.domain;

import io.nats.client.Connection;
import io.nats.client.Nats;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class Pub {

    public String PublishKon() throws IOException, InterruptedException {
        Connection nats = Nats.connect();
        String message = "Hello NATS jibit";
        nats.publish("nats.demo.service", message.getBytes());
        System.out.println("Sent: " + message);
        return "OK bood";
    }
}
