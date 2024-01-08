package org.kooguy.work.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@RequestMapping(value = "/admin")
@Controller
public class AdminController {

    @GetMapping("/test")
    @ResponseBody
    public String test(){
        return "test success";
    }
}
