package pers.caijx.restful.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pers.caijx.restful.domain.Greeting;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by caijx on 2018/7/1/001.
 */
@RestController
public class GreetingController {

    private static final String template = "Hello,%s！";

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name",defaultValue = "world") String name) {
        return new Greeting(counter.incrementAndGet(),String.format(template,name));
    }
}
