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
    SUCCESS(true,200,"成功"),

    /**
     * 未知错误
     */
    UNKNOWN_ERROR(false,100,"未知错误"),

    /**
     * 参数错误
     */
    PARAM_ERROR(false,400,"参数错误");

    /**
     * 响应是否成功
     */
    private Boolean success;

    /**
     * 响应状态码
     */
    private Integer code;

    /**
     * 响应信息
     */
    private String message;

    ResultCodeEnum(boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
