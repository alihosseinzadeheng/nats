package ir.jibit.nats.service;

import ir.jibit.nats.domain.Pub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class AppService {

    final private Pub pub;

    @Autowired
    public AppService(Pub pub) {
        this.pub = pub;
    }

    public String pubKon() throws IOException, InterruptedException {
        return pub.PublishKon();
    }
}
