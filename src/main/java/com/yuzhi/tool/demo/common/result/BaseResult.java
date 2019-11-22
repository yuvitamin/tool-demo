package com.yuzhi.tool.demo.common.result;

import lombok.Builder;
import lombok.Data;

/**
 * @author yuzhi
 */
@Data
@Builder
public class BaseResult<T> implements Result<T> {
    private int status;
    private String msg;
    private T data;

    public static BaseResult success() {
        return BaseResult
                .builder()
                .status(StatusTypeEnum.SUCCESS.getStatus())
                .msg(StatusTypeEnum.SUCCESS.getMsg())
                .build();
    }
    public static <T> BaseResult success(T data){
        return BaseResult
                .builder()
                .status(StatusTypeEnum.SUCCESS.getStatus())
                .msg(StatusTypeEnum.SUCCESS.getMsg())
                .data(data)
                .build();
    }
    public static <T> BaseResult success(StatusTypeEnum statusTypeEnum,T data){
        return BaseResult
                .builder()
                .status(statusTypeEnum.getStatus())
                .msg(statusTypeEnum.getMsg())
                .data(data)
                .build();
    }
    public static <T> BaseResult success(int status, String msg,T data){
        return BaseResult
                .builder()
                .status(status)
                .msg(msg)
                .data(data)
                .build();
    }
    public static BaseResult error(){
        return BaseResult
                .builder()
                .status(StatusTypeEnum.SYSTEM_INNER_ERROR.getStatus())
                .msg(StatusTypeEnum.SYSTEM_INNER_ERROR.getMsg())
                .build();
    }
    public static BaseResult error(StatusTypeEnum statusTypeEnum){
        return BaseResult
                .builder()
                .status(statusTypeEnum.getStatus())
                .msg(statusTypeEnum.getMsg())
                .build();
    }
    public static BaseResult error(int status,String msg){
        return BaseResult
                .builder()
                .status(status)
                .msg(msg)
                .build();
    }


}
