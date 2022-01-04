package com.lmm.i18ntest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author minmin.liu
 * @version 1.0
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
//        throw new RuntimeException("你好");
        return "你好";
    }
}
