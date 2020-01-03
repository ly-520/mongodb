package com.mongodb.mongodb.exception;

import com.mongodb.mongodb.base.JsonResult;
import com.mongodb.mongodb.common.CodeMsgEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartException;

/**
 * @author ljt
 * @Title: ApplicationControllerAdvice
 * @ProjectName mongodb
 * @Description:
 * @Version:
 * @date 2020/1/3 11:50
 */
@Slf4j
@ControllerAdvice
public class ApplicationControllerAdvice {

    /**
     * 全局异常捕捉处理
     *
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public JsonResult<Void> infoHandler(Exception ex) {
        log.error("接口请求异常 {}", ex);
        ex.printStackTrace();
        JsonResult<Void> jsonResult = new JsonResult<>();
        jsonResult.fail(CodeMsgEnum.SYSTEM_ERROR);
        return jsonResult;
    }

    @ExceptionHandler(MultipartException.class)
    public JsonResult<Void> handleMultipartException(MultipartException e) {
        log.error("接口请求异常", e);
        e.printStackTrace();
        JsonResult<Void> jsonResult = new JsonResult<>();
        jsonResult.fail(CodeMsgEnum.UPLOAD_FAIL);
        return jsonResult;
    }
}
