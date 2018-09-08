package cn.carbs.backend.controller;

import cn.carbs.backend.modules.update.UpdateInfoInput;
import cn.carbs.backend.modules.update.UpdateInfoOutput;
import org.springframework.web.bind.annotation.*;

/**
 * Created by carbs on 2018/6/23.
 */
@RestController
public class ControllerMainPage {

    //TODO 根据update传来的参数，判断是否需要更新
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public UpdateInfoOutput update(@ModelAttribute("UpdateInfoInput") UpdateInfoInput updateInfoInput) {
        //TODO 返回升级文件信息

        UpdateInfoOutput updateInfoOutput = new UpdateInfoOutput();

        return updateInfoOutput;
    }

    //TODO 返回首页的数据
    @RequestMapping(value = "/mainPage/{id}", method = RequestMethod.GET)
    public String mainPage(@PathVariable("id") Integer id) {
        return "id : " + id;
    }

}