package izo.wtamanagementsystem.controller;

import izo.wtamanagementsystem.model.Program;
import izo.wtamanagementsystem.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
