package com.yuzhi.tool.demo.domain.entity;

import lombok.Data;

/**
 * @author yuzhi
 */
@Data
public class Company {
    private Integer companyId;

    private String companyName;

    private String companyLogo;

    private String companyDescribe;

    private String companyAddress;

    private String companyHotline;
}