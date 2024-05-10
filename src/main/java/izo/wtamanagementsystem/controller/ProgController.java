package izo.wtamanagementsystem.controller;

import izo.wtamamagementsystem.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class ProgController {
    @Autowired
    private ProgramService programService;

    @GetMapping("progInput")
    public String progInput() {
        return "/program/progInput";
    }

    @GetMapping("progMidInput")
    public String progMidInput() {
        return "/program/progMidInput";
    }
}
