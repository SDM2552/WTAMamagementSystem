package izo.wtamamagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String root(){
        return "root";
    }

    @GetMapping("/syllabus")
    public String syllabus(){
        return "syllabus/input";
    }
}
