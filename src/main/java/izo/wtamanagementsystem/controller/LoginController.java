//package izo.wtamanagementsystem.controller;
//
//import izo.wtamanagementsystem.model.User;
//import izo.wtamanagementsystem.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import javax.servlet.http.HttpSession;
//
//@Controller
//public class LoginController {
//
//    @Autowired
//    private UserService userService;
//
//    @PostMapping("/login")
//    public String login(String username, String password, HttpSession session, Model model) {
//        User user = userService.login(username, password);
//        if (user != null) {
//            session.setAttribute("user", user);
//            switch (user.getRole()) {
//                case "STUDENT":
//                    return "redirect:/student/home";
//                case "PROFESSOR":
//                    return "redirect:/professor/home";
//                case "STAFF":
//                    return "redirect:/staff/home";
//                default:
//                    model.addAttribute("message", "Invalid role");
//                    return "login";
//            }
//        } else {
//            model.addAttribute("message", "Invalid username or password");
//            return "login";
//        }
//    }
//}