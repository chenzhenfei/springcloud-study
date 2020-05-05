package com.example.springcloud_consul.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenzhenfei
 * @title: DemoController
 * @projectName studyspringcloud-master
 * @description: consul 学习
 * @date 2020/4/300:22
 */
@RestController
@RequestMapping("consul")
public class DemoController {
    @RequestMapping("/index")
    public String home() {
        return "Hello world";
    }
}
