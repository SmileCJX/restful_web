package pers.caijx.restful.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/7/9/009.
 */
@RestController
@RequestMapping("/tvseries")
public class TvSeriesController {

    @GetMapping
    public Map<String,Object> sayHello() {
        Map<String,Object> result = new HashMap<>();
        result.put("message","hello,world");
        return result;
    }
}
