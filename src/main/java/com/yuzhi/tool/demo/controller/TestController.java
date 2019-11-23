package com.yuzhi.tool.demo.controller;

import com.yuzhi.tool.demo.domain.entity.Company;
import com.yuzhi.tool.demo.service.TestServie;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yuzhi
 */
@RestController
public class TestController {
    @Resource
    TestServie testServie;
    @RequestMapping("/test")
    public Company findCompanyById(int companyId){
//        测试全局异常
//        int a =2 / 0;
        return testServie.findCompanyById(companyId);

    }
}
