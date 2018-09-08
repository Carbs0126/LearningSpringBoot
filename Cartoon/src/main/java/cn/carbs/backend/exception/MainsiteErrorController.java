package cn.carbs.backend.exception;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by carbs on 2018/9/8.
 */
//添加上这个controller后，就会跳转到相应的页面，使用注解 @Controller，返回  return "/401";
//如果使用   @RestController 则返回对应的string
@RestController
public class MainsiteErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError(HttpServletRequest request){
        //获取statusCode:401,404,500
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        if(statusCode == 401){
            return "/401";
        }else if(statusCode == 404){
            return "/404";
        }else if(statusCode == 403){
            return "/403";
        }else{
            return "/500";
        }
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
