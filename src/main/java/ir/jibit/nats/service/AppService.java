package ir.jibit.nats.service;

import io.nats.client.Connection;
import io.nats.client.Nats;
import ir.jibit.nats.domain.Pub;
import ir.jibit.nats.domain.Sub1;
import ir.jibit.nats.domain.Sub2;
import ir.jibit.nats.domain.Sub3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.concurrent.TimeoutException;

@Service
public class AppService {

    final private Pub pub;

    @Autowired
    public AppService(Pub pub) {
        this.pub = pub;
    }

    public String pubKon() throws IOException, InterruptedException, TimeoutException {


        return pub.PublishKon();
    }
}
