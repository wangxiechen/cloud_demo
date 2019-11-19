package com.wxc.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@FeignClient(name = "provider-server2")
public interface FeignService {
    @RequestMapping("provider/users")
    public List<String> selectAllUsers();

}
