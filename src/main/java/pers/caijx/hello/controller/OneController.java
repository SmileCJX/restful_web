package pers.caijx.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by caijx on 2018/7/1/001.
 */
@Controller
public class OneController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/adduser")
    @ResponseBody
    public String index() {
        String sql = "insert into hello(id,name) values(1,'zhangsan')";
        jdbcTemplate.execute(sql);
        System.out.println("执行完成");
        return "hello spirng boot";
    }
}
