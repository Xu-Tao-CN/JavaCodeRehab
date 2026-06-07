package com.xutao.study.coderehab.异常;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/*@RestControllerAdvice是@ControllerAdvice+@ResponseBody
* @ControllerAdvice：异常处理，参数绑定，数据预处理
* @ResponseBody：返回JSON
* */
@RestControllerAdvice
public class globalExceptionHandler {

    @ExceptionHandler(selfDifineException.class)
    public String handleBusinessException(selfDifineException e){
        return e.getMessage() + "12324564654546546";
    }

}
