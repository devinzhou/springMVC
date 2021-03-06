package com.test.pluto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("")
@Controller
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model) {

        model.addAttribute("message", "hello spring mvc framework测试中文");
        System.out.println(System.getProperty("file.encoding") + "测试中文");
        return "hello";
    }
}
