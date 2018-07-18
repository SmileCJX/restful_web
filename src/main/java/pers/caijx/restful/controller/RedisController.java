package pers.caijx.restful.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.caijx.restful.domain.JSONResult;
import pers.caijx.restful.domain.User;
import pers.caijx.restful.pojo.SysUser;
import pers.caijx.restful.utils.JsonUtils;
import pers.caijx.restful.utils.RedisOperator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by caijx on 2018/7/18/018.
 */
@RestController
@RequestMapping("redis")
public class RedisController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisOperator redisOperator;

    @RequestMapping("/test")
    public JSONResult test() {
        stringRedisTemplate.opsForValue().set("cache","hello caijx~~~");
        SysUser user = new SysUser();
        user.setId("100111");
        user.setUsername("caijx");
        user.setIsDelete(0);
        user.setRegistTime(new Date());
        stringRedisTemplate.opsForValue().set("json:user", JsonUtils.objectToJson(user));
        SysUser jsonUser = JsonUtils.jsonToPojo(stringRedisTemplate.opsForValue().get("json:user"),SysUser.class);
        return JSONResult.ok(jsonUser);
    }

    @RequestMapping("/getJsonList")
    public JSONResult getJsonList() {
        User user  = new User();
        user.setAge(18);
        user.setName("王一方");
        user.setPassword("123456");
        user.setBirthday(new Date());

        User u1 = new User();
        u1.setAge(19);
        u1.setName("黄晓峰");
        u1.setPassword("123456");
        u1.setBirthday(new Date());

        User u2 = new User();
        u2.setAge(17);
        u2.setName("李小强");
        u2.setPassword("123456");
        u2.setBirthday(new Date());

        List<User> userList = new ArrayList<>();
        userList.add(user);
        userList.add(u1);
        userList.add(u2);

        redisOperator.set("json:info:userlist",JsonUtils.objectToJson(userList),2000);
        String userListJson = redisOperator.get("json:info:userlist");
        List<User> userListBean = JsonUtils.jsonToList(userListJson,User.class);
        return JSONResult.ok(userListBean);
    }
}
