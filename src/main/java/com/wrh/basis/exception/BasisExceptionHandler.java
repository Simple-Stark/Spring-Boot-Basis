package com.wrh.basis.exception;

import com.wrh.basis.common.Result;
import com.wrh.basis.common.ResultCodeEnum;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *  统一全局异常处理类
 *
 * @author Simple
 * @date 2020-11-16
 */
@ControllerAdvice
public class BasisExceptionHandler {

    private static Logger log = LogManager.getLogger(BasisExceptionHandler.class);

    /**
     * 通用异常处理方法
     * @param e 未知异常
     * @return com.wrh.basis.common.Result 实例
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e) {
        // 打印日志
        log.error("BasisExceptionHandler =====>> {}",e.getMessage(),e);
        return Result.error();
    }

    /**
     * 空指针异常处理
     * @param e 空指针异常
     * @return com.wrh.basis.common.Result 实例
     */
    @ExceptionHandler(NullPointerException.class)
    @ResponseBody
    public Result error(NullPointerException e) {
        // 打印日志
        log.error("BasisExceptionHandler =====>> {}",e.getMessage(),e);
        return Result.setResult(ResultCodeEnum.NULL_POINT);
    }

    /**
     * 自定义测试异常处理方法
     * @param e 自定义测试异常类
     * @return com.wrh.basis.common.Result 实例
     */
    @ExceptionHandler(TestException.class)
    @ResponseBody
    public Result error(TestException e) {
        // 打印日志
        log.error("BasisExceptionHandler =====>> {}",e.getMessage(),e);
        return Result.error().message(e.getMessage()).code(e.getCode());
    }
}
