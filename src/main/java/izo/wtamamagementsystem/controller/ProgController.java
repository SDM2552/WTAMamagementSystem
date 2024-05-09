package izo.wtamamagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProgController {

    @GetMapping("progInput")
    public String progInput() {
        return "/program/progInput";
    }

    @GetMapping("progMidInput")
    public String progMidInput() {
        return "/program/progMidInput";
    }
}
