package com.wxc.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "provider-server2")
public interface FeignService {

}
