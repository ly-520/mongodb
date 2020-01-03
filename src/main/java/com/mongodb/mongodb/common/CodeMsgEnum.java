package com.mongodb.mongodb.common;/**
 * @author ljt
 * @Title: CodeMsgEnum
 * @ProjectName mongodb
 * @Description:
 * @Version:
 * @date 2020/1/3 11:58
 */

public enum CodeMsgEnum {
    SUCCESS(0,"SUCCESS"),
    FAIL_PARAM_NULL(100,"请求参数格式错误"),
    FAIL_MOBILE_REGISTERED(101,"手机号已注册"),
    LOGIN_FAIL(102,"登录失败"),
    USER_NOT_FOUND(103,"未注册用户"),
    USER_DISABLED(104,"无效用户"),
    LOGOUT_SUCCESS(105,"登出成功"),
    NO_LOGIN(106,"登录失效"),
    VERIFY_CODE_ERROR(107,"手机验证码不正确，重新发送填写吧"),
    SYSTEM_ERROR(108,"系统错误"),
    UPLOAD_FAIL(110,"上传失败"),
        ;
    private int code;
    private String msg;

    CodeMsgEnum(int code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public String getMsg(){
        return msg;
    }
    public Integer getCode(){
        return code;
    }


}
