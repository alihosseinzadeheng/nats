package ir.jibit.nats.service;

import ir.jibit.nats.domain.Pub;
import ir.jibit.nats.domain.RequestDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Slf4j
@Service
public class AppService {
    final private Pub pub;

    @Autowired
    public AppService(Pub pub) {
        this.pub = pub;
    }

    public String pubKon(RequestDO msg) throws IOException, InterruptedException {
        return pub.PublishKon(msg);
    }
}
