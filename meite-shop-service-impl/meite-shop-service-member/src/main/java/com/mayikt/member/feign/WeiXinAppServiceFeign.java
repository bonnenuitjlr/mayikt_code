package com.mayikt.member.feign;

import com.mayikt.weixin.service.WeiXinAppService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "app-mayikt-weixin")
public interface WeiXinAppServiceFeign extends WeiXinAppService {
    
}
