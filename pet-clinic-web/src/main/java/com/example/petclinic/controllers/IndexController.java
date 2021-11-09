package com.example.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {

    @RequestMapping({"","/","index","index.html"})
    public String index() {

        return "index";
    }

    @RequestMapping("/oups")
    public String oupsHandler() {
        return "notImplemented";
    }
}
