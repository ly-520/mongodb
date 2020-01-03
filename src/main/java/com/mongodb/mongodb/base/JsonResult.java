package com.mongodb.mongodb.base;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.mongodb.mongodb.common.CodeMsgEnum;
import lombok.extern.slf4j.Slf4j;

/**
 * @author ljt
 * @Title: JsonResult
 * @ProjectName mongodb
 * @Description:
 * @Version:
 * @date 2020/1/3 11:54
 */

@Slf4j
public class JsonResult<T> {

    private Integer code;
    private String message;
    private T data;

    public void success(T data) {
        this.code = 0;
        this.data = data;
        this.message = "SUCCESS";
    }

    public void success() {
        this.code = 0;
        this.message = "SUCCESS";
    }

    public void fail(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public void fail(CodeMsgEnum codeMsgEnum){
        this.code = codeMsgEnum.getCode();
        this.message = codeMsgEnum.getMsg();
    }

    public void fail(CodeMsgEnum codeMsgEnum, Object msg) {
        this.code = codeMsgEnum.getCode();
        this.message = String.format(codeMsgEnum.getMsg(), msg);
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this, SerializerFeature.WriteDateUseDateFormat);
    }
}
