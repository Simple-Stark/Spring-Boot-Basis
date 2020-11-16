package com.wrh.basis.exception;

import com.wrh.basis.common.ResultCodeEnum;

/**
 * 自定义异常测试
 *
 * @author Simple
 * @date 2020-11-16
 */
public class TestException extends RuntimeException{

    /**
     * 异常错误代码
     */
    private Integer code;

    public TestException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public TestException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "TestException{" + "code=" + code + ", message=" + this.getMessage() + '}';
    }
}
