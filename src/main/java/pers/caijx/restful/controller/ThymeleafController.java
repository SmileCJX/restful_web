package pers.caijx.restful.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by caijx on 2018/7/2/002.
 */
@Controller
@RequestMapping("/th")
public class ThymeleafController {

    @RequestMapping("/index")
    public String index(ModelMap map) {
        map.addAttribute("name","templates.thymeleaf-caijx");
        return "thymeleaf/index";
    }

    @RequestMapping("/center")
    public String center() {
        return "thymeleaf/center/center";
    }
}
