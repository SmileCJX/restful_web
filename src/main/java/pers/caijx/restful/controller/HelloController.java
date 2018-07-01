package pers.caijx.restful.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.caijx.restful.pojo.JSONResult;
import pers.caijx.restful.pojo.Resource;

/**
 * Created by Administrator on 2018/7/1/001.
 */
@RestController
public class HelloController {

    @Autowired
    private Resource resource;

    @RequestMapping("/hi")
    public Object hello() {
        return "hello springboot";
    }

    @RequestMapping("/getResource")
    public JSONResult getResource() {
        Resource bean = new Resource();
        BeanUtils.copyProperties(resource,bean);
        return JSONResult.ok(bean);
    }
}
