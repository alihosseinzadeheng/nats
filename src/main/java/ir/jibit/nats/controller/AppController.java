package ir.jibit.nats.controller;

import ir.jibit.nats.domain.RequestDO;
import ir.jibit.nats.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@Controller
@RequestMapping(value = "/admin")
public class AppController {

    final private AppService appService;

    @Autowired
    public AppController(AppService appService) {
        this.appService = appService;
    }

    @PostMapping(value = "/pubkon")
    @ResponseBody
    String pubKon(@RequestBody RequestDO msg) throws IOException, InterruptedException {
        return appService.pubKon(msg);
    }
}
