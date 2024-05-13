package izo.wtamanagementsystem.controller;



import izo.wtamanagementsystem.model.ClassRomm;
import izo.wtamanagementsystem.model.Program;
import izo.wtamanagementsystem.service.CategoryService;
import izo.wtamanagementsystem.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ProgController {

    @Autowired
    private ProgramService programService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categoryInput")
    public String categoryInput() {
        return "/program/categoryInput";
    }

    @PostMapping("/categoryInsert")
    public String categoryInsert(@ModelAttribute ClassRomm category) {
        categoryService.insertCategory(category);
        return "redirect:/categoryInput";
    }


    @GetMapping("/progInput")
    public String progInput() {

        return "/program/progInput";
    }

    @PostMapping("/progInsert")
    public String progInputInsert(Program program) {

        programService.insertProgram(program);
        return "/root";
    }






}

