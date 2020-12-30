package com.wrh.basis.common;

import java.util.HashMap;
import java.util.Map;

/**
 * 统一消息返回结果类
 *
 * @author Simple
 * @date 2020-11-11
 */
public class Result {

    private Integer code;

    private String message;

    private Map<String, Object> data = new HashMap<String, Object>();

    /**
     * 构造器私有，防止直接创建
     */
    private Result(){}

    /**
     * 通用返回成功
     * @return com.wrh.basis.common.Result 的实例
     */
    public static Result success() {
        Result result = new Result();
        result.setCode(ResultCodeEnum.SUCCESS.getCode());
        result.setMessage(ResultCodeEnum.SUCCESS.getMessage());
        return result;
    }

    /**
     * 未知错误返回失败
     * @return com.wrh.basis.common.Result 的实例
     */
    public static Result error() {
        Result result = new Result();
        result.setCode(ResultCodeEnum.UNKNOWN_ERROR.getCode());
        result.setMessage(ResultCodeEnum.UNKNOWN_ERROR.getMessage());
        return result;
    }

    /**
     * 设置返回结果
     * @param resultCodeEnum 结果枚举类
     * @return com.wrh.basis.common.Result 的实例
     */
    public static Result setResult(ResultCodeEnum resultCodeEnum) {
        Result result = new Result();
        result.setCode(resultCodeEnum.getCode());
        result.setMessage(resultCodeEnum.getMessage());
        return result;
    }

    /*------------使用链式编程，返回类本身-----------**/

    /**
     * 自定义返回数据
     * @param map 自定义的数据
     * @return com.wrh.basis.common.Result 的实例
     */
    public Result data(Map<String,Object> map) {
        this.setData(map);
        return this;
    }

    /**
     * 通用设置data
     * @param key 自定义key
     * @param value 自定义value
     * @return com.wrh.basis.common.Result 的实例
     */
    public Result data(String key,Object value) {
        this.data.put(key, value);
        return this;
    }

    /**
     * 自定义状态信息
     * @param message 自定义的状态信息
     * @return com.wrh.basis.common.Result 的实例
     */
    public Result message(String message) {
        this.setMessage(message);
        return this;
    }

    /**
     * 自定义状态码
     * @param code 自定义的状态码
     * @return com.wrh.basis.common.Result 的实例
     */
    public Result code(Integer code) {
        this.setCode(code);
        return this;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
