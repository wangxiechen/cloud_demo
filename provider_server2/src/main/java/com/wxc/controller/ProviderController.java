package com.wxc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/provider")
public class ProviderController {

    @RequestMapping("/users")
    public List<String> showUsers(){
        return Arrays.asList("我要","买苹果","手机");
    }

}
