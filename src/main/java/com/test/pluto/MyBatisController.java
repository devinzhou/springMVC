package com.test.pluto;

import com.alibaba.druid.util.StringUtils;
import com.sun.deploy.net.HttpResponse;
import com.test.pluto.model.User;
import com.test.pluto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyBatisController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/mybatis")
    public ModelAndView indexView(@RequestParam String id){
        User user = userService.getUserUsingId(id);
        if (!StringUtils.equals(id, user.getId())) {
            user.setId(id);
        }
        ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("user",user);
        return modelAndView;
    }
}
