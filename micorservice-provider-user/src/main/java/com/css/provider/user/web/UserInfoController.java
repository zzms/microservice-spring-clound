package com.css.provider.user.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by leosoft on 2017/12/29.
 */
@RestController
public class UserInfoController {

    @GetMapping(value = "userInfo/getUserById/{id}")
    public String getUserById(@PathVariable String id) {
        return "得到一个Id:"+id;
    }
}
