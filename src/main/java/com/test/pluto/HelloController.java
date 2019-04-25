package com.test.pluto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/hello")
@Controller
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model) {

        model.addAttribute("message", "hello spring mvc framework测试中文");
        System.out.println(System.getProperty("file.encoding") + "测试中文");
        return "hello";
    }

    @RequestMapping("/h")
    public String printH(ModelMap model, @RequestParam String personName) {
        model.addAttribute("message", personName);
        return "hello";
    }

    @RequestMapping( value = "/api", consumes = { "application/JSON" })
    public String printApi(@RequestParam String name) {
        return "api";
    }
}
