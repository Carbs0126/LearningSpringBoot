package cn.carbs.backend.exception;

/**
 * Created by carbs on 2018/9/8.
 */
import javax.servlet.http.HttpServletRequest;

import cn.carbs.backend.entity.ErrorData;
import cn.carbs.backend.entity.ResponseEntityError;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseEntityError defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        logger.error("defaultErrorHandler : " + e.getMessage());

        ResponseEntityError responseEntity = new ResponseEntityError();
        int errorCode;
        //TODO 如何获取所有的状态码
        if (e instanceof org.springframework.web.servlet.NoHandlerFoundException) {
            errorCode = 404;
        } else {
            errorCode = 500;
        }
        ErrorData errorData = new ErrorData(errorCode, e.getMessage());
        responseEntity.errorData = errorData;
        return responseEntity;
    }
}