package pers.caijx.restful.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by caijx on 2018/7/17/017.
 */
@Controller
@RequestMapping("err")
public class ErrorController {

    @RequestMapping("/error")
    public String error() {
        int a =  1 / 0;
        return "thymeleaf/error";
    }
}
