package ir.jibit.nats.domain;

import io.nats.client.Connection;
import io.nats.client.Nats;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Slf4j
@Component
public class Pub {
    public String PublishKon(RequestDO msg) throws IOException, InterruptedException {
        Connection nats = Nats.connect();
        nats.publish("nats.demo.service", msg.getMessage().getBytes());
        log.debug("This is message: {}", msg);
        return "OK bood";
    }
}
