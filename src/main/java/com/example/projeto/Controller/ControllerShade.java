package com.example.projeto.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerShade {

    @RequestMapping("/")
    public String homeApp(){
        return "index";
    }
}
