package pers.caijx.restful.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import pers.caijx.restful.pojo.Resource;

/**
 请不要使用@RestController,不然返回前端的只是一串字符串。
 @RestController注解表示返回的内容都是HTTP Content不会被模版引擎处理，
 它默认为该类中的所有的方法都添加了@ResponseBody
 * Created by Administrator on 2018/7/1/001.
 */
@Controller
@RequestMapping("ftl")
public class FreemarkerController {

    @Autowired
    private Resource resource;

    @RequestMapping("/index")
    public String index(ModelMap map) {
        map.addAttribute("resource",resource);
        return "freemarker/index";
    }

    @RequestMapping("/center")
    public String center() {
        return "freemarker/center/center";
    }
}
