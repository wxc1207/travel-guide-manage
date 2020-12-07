package com.chao.travel.guide.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : WXC
 * date    : 2020/12/7 11:05
 * desc    :- 项目创建的测试类
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "hello";
    }
}
