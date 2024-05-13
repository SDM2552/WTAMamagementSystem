package izo.wtamanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {


    @GetMapping("/")
    public String root(){
        return "root";
    }
    @GetMapping("/sample")
    public String sample01(){
        return "sample";
    }
    @GetMapping("/sample2")
    public String sample02(){
        return "sample2";
    }



    @GetMapping("/syllabus")
    public String syllabus(){
        return "syllabus/input";
    }

    @GetMapping("/classList")
    public String classList(){
        return "class/classList";
    }
}
