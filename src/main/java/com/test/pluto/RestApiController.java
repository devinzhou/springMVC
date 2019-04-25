package com.test.pluto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestApiController {
    @RequestMapping(value = "/name")
    public Model getName(@RequestParam String name) {
        Model model = new Model();
        model.name = name;
        model.age = "12";
        return model;
    }
}
