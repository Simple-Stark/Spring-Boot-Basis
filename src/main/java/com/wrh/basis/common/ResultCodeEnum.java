package com.wrh.basis.common;

/**
 * 统一消息返回 结果枚举类
 *
 * @author Simple
 * @date 2020-11-11
 */
public enum ResultCodeEnum {
    /**
     * 成功
     */
    SUCCESS(200,"成功"),

    /**
     * 未知错误
     */
    UNKNOWN_ERROR(201,"未知错误"),

    /**
     * 空指针异常错误
     */
    NULL_POINT(202,"空指针异常，请联系管理员！"),

    /**
     * 参数错误
     */
    PARAM_ERROR(400,"参数错误");

    /**
     * 响应状态码
     */
    private Integer code;

    /**
     * 响应信息
     */
    private String message;

    ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
