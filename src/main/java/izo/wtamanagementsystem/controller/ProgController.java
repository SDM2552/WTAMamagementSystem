package izo.wtamanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class ProgController {
    @Autowired
    private HttpSession httpSession;

    @GetMapping("progInput")
    public String progInput() {
        return "/program/progInput";
    }

    @GetMapping("progMidInput")
    public String progMidInput() {
        return "/program/progMidInput";
    }
}
