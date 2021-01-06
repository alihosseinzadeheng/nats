package ir.jibit.nats.controller;

import ir.jibit.nats.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
@RequestMapping(value = "/admin")
public class AppController {

    final private AppService appService;

    @Autowired
    public AppController(AppService appService) {
        this.appService = appService;
    }

    @GetMapping(value = "/pubkon")
    @ResponseBody
    String pubKon() throws IOException, InterruptedException {
        return appService.pubKon();
    }
}
