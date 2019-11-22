package com.yuzhi.tool.demo.service.impl;

import com.yuzhi.tool.demo.domain.entity.Company;
import com.yuzhi.tool.demo.mapper.CompanyMapper;
import com.yuzhi.tool.demo.service.TestServie;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yuzhi
 */
@Service
public class TestServiceimpl implements TestServie {
    @Resource
    CompanyMapper companyMapper;
    @Override
    public Company findCompanyById(int companyId) {
        return companyMapper.selectByPrimaryKey(companyId);
    }
}
