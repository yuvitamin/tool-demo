package com.yuzhi.tool.demo.common.handler;

import com.yuzhi.tool.demo.common.result.BaseException;
import com.yuzhi.tool.demo.common.result.BaseResult;
import com.yuzhi.tool.demo.common.result.StatusTypeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局统一的异常处理
 *
 * @author yuzhi
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    /**
     * 其他异常（非RuntimeException）抛出系统导常
     * @param
     * @return
     */
    @ExceptionHandler(Exception.class)
    public BaseResult handlerException(Exception e) {
        return BaseResult.error(StatusTypeEnum.SYSTEM_INNER_ERROR);
    }
    /**
     * RuntimeException 抛出业务异常
     * @param
     * @return
     */
    @ExceptionHandler(BaseException.class)
    public BaseResult BaseException(Exception e) {
        return BaseResult.error(StatusTypeEnum.BUSINESS_ERROR);
    }
}
