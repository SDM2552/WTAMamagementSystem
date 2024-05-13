//package izo.wtamanagementsystem.controller;
//
//import izo.wtamanagementsystem.model.User;
//import izo.wtamanagementsystem.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//@Controller
//@RequestMapping("/register")
//public class RegisterController {
//
//    @Autowired
//    private UserService userService;
//
//    @PostMapping
//    public ModelAndView register(User user) {
//        user.setRole("STUDENT"); // Default role
//        userService.saveUser(user);
//        return new ModelAndView("redirect:/login", "message", "Successfully registered!");
//    }
//}