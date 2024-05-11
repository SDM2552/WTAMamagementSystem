package izo.wtamanagementsystem.controller;


import izo.wtamanagementsystem.model.Program;
import izo.wtamanagementsystem.model.ProgramMid;
import izo.wtamanagementsystem.service.ProgramMidService;
import izo.wtamanagementsystem.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ProgController {
    @Autowired
    private ProgramService programService;
    @Autowired
    private ProgramMidService programMidService;

    @GetMapping("/progInput")
    public String progInput() {

        return "/program/progInput";
    }
    @PostMapping("/progInsert")
    public String progInputInsert(@ModelAttribute Program program) {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$"+program);
        programService.insertProgram(program);
        return "/root";
    }





    @GetMapping("progMidInput")
    public String progMidInput() {
        return "/program/progMidInput";
    }


    @PostMapping("/progMidInputInsert")
    public String progMidInputInsert(ProgramMid programMid){
        System.out.printf("*****************Mid"+programMid);
        programMidService.insertProgram(programMid);
        return "redirect:/progMidInput";
        }
    }

