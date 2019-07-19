package com.mayikt.member.service;

import com.mayikt.weixin.entity.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Api(tags = "会员服务实现接口")
public interface MemberService {
    /**
     * 会员服务接口调用微信接口
     *
     * @return
     */
    @ApiOperation(value = "会员服务调用微信服务")
    @GetMapping("/memberInvokeWeixin")
    public AppEntity memberInvokeWeixin();
}
