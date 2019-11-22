package com.yuzhi.tool.demo.common.result;


import lombok.Data;

/**
 * @author yuzhi
 */
@Data
public class BaseException extends RuntimeException {
//    private final StatusTypeEnum statusTypeEnum;
//
//    public BaseException(StatusTypeEnum statusTypeEnum) {
//        this.statusTypeEnum = statusTypeEnum;
//    }
    private int status;
    private String msg;

    public BaseException(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }
}
