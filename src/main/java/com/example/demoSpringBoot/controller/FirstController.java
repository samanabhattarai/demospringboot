package com.example.demoSpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class FirstController {

    @RequestMapping(value="/first", method =RequestMethod.GET )
    @ResponseBody
    public String firstMapping(){
        return "This is example for controller.";
    }



}
