package com.chengzhi.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexContorller {
    @RequestMapping(value = "/")
    public String getIndex(){
        return "index";
    }
}
