package com.mayikt.weixin.service.impl;


import com.mayikt.weixin.entity.AppEntity;
import com.mayikt.weixin.service.WeiXinAppService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeiXinServiceImpl implements WeiXinAppService {

    public AppEntity getASpp() {
        return new AppEntity("11","name");
    }
    
}
