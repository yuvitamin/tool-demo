package com.yuzhi.tool.demo.common.result;

/**
 * @author yuzhi
 */
public enum StatusTypeEnum {
    /**
     * 成功
     */
    SUCCESS(200, "success"),
    /**
     *业务错误
     */
    BUSINESS_ERROR(404, "error"),
    /**
     * 系统错误
     */
    SYSTEM_INNER_ERROR(40001, "system error");

    private String msg;
    private int status;

    StatusTypeEnum(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public int getStatus() {
        return status;
    }

}
