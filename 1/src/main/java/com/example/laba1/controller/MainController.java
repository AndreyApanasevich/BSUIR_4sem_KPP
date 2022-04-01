package com.example.laba1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String homeView(@RequestParam(required = false) Integer value1,
                           @RequestParam(required = false) Integer value2,
                           @RequestParam(required = false) Integer value3,
                           @RequestParam(required = false, value = "per", defaultValue = "False") Boolean per_button,
                           @RequestParam(required = false, value = "sq", defaultValue = "False") Boolean sq_button,
                           Model model){
        System.out.println(value1 + " " + value2 + " " + value3 + " " + per_button + " " + sq_button);

        if(value1 != null && value2 != null && value3 != null && per_button == true){
            Integer per = 0;
            per = value1 + value2 + value3;
            model.addAttribute("value1", value1);
            model.addAttribute("value2", value2);
            model.addAttribute("value3", value3);
            model.addAttribute("per", per);
        }

        if(value1 != null && value2 != null && value3 != null && sq_button == true){
            double sque = 0;
            Integer p = (value1 + value2 + value3)/2;
            sque = Math.sqrt(p * (p - value1) * (p - value2) * (p - value3));
            model.addAttribute("value1", value1);
            model.addAttribute("value2", value2);
            model.addAttribute("value3", value3);
            model.addAttribute("sque", sque);
        }

        return "home_page";
    }

}


