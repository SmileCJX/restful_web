package pers.caijx.restful.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.caijx.restful.pojo.JSONResult;
import pers.caijx.restful.pojo.User;

import java.util.Date;

/**
 * @RestController = @Controller + @ResponseBody
 * Created by caijx on 2018/7/1/001.
 */
@RestController
public class UserController {

    @RequestMapping("/getUser")
    public User getUser() {
        User user = new User();
        user.setName("caijx");
        user.setAge(24);
        user.setPassword("123456");
        user.setBirthday(new Date());
        return user;
    }

    @RequestMapping("/getUserJson")
    public JSONResult getUserJson() {
        User user = new User();
        user.setName("caijx");
        user.setAge(24);
        user.setPassword("123456");
        user.setBirthday(new Date());
        return JSONResult.ok(user);
    }

}
