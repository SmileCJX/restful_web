package pers.caijx.restful.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.caijx.restful.domain.JSONResult;
import pers.caijx.restful.pojo.SysUser;
import pers.caijx.restful.utils.JsonUtils;

import java.util.Date;

/**
 * Created by caijx on 2018/7/18/018.
 */
@RestController
@RequestMapping("redis")
public class RedisController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

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
}
