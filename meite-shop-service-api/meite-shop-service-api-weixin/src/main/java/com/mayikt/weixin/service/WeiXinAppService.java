package com.mayikt.weixin.service;

import com.mayikt.weixin.entity.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.naming.Name;

@Api(tags = "微信服务接口")
public interface WeiXinAppService {
    /**
     * 功能说明：应用服务接口
     * @return
     */
    @ApiOperation(value = "微信应用服务接口")
    @GetMapping("/getApp")
    public AppEntity getASpp();
    
}
