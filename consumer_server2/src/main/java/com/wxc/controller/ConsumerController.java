package com.wxc.controller;

import com.wxc.client.FeignService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Resource
    private FeignService feignService;

    @RequestMapping("/user/list")
    public List<String> showUsers(){
        return feignService.selectAllUsers();
    }

}
