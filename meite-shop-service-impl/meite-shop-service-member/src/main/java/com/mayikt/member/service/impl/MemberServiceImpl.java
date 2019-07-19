package com.mayikt.member.service.impl;

import com.mayikt.member.feign.WeiXinAppServiceFeign;
import com.mayikt.member.service.MemberService;
import com.mayikt.weixin.entity.AppEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberServiceImpl implements MemberService {
    
    @Autowired
    private WeiXinAppServiceFeign weiXinAppServiceFeign;

    public AppEntity memberInvokeWeixin() {
        return weiXinAppServiceFeign.getASpp();
    }
}
