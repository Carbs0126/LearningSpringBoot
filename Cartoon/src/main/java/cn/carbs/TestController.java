package cn.carbs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by carbs on 2018/6/23.
 */

@RestController
public class TestController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String say(){
        return "hello world!";
    }

}
