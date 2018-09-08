package cn.carbs.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by carbs on 2018/6/23.
 */
@RestController
public class ControllerTest {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String say() {
        return "hello world!";
    }

    @RequestMapping(value = "/ex", method = RequestMethod.GET)
    public String show() throws Exception {
        throw new Exception("exception occurred");
    }
}