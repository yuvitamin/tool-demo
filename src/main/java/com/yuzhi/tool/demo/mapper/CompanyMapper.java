package com.yuzhi.tool.demo.mapper;

import com.yuzhi.tool.demo.domain.entity.Company;
import org.apache.ibatis.annotations.Param;

/**
 * @author yuzhi
 */
public interface CompanyMapper {
    int deleteByPrimaryKey(Integer companyId);

    int insert(Company record);

    int insertSelective(Company record);

    Company selectByPrimaryKey( Integer companyId);

    int updateByPrimaryKeySelective(Company record);

    int updateByPrimaryKey(Company record);
}