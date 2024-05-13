//package izo.wtamanagementsystem.controller;
//
//import izo.wtamanagementsystem.model.User;
//import izo.wtamanagementsystem.service.CourseService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import javax.servlet.http.HttpSession;
//
//@Controller
//public class CourseController {
//    @Autowired
//    private CourseService courseService;
//
//    @GetMapping("/enroll")
//    public String showEnrollmentForm(HttpSession session, Model model) {
//        User user = (User) session.getAttribute("user");
//        if (user != null && courseService.canEnroll(user.getId())) {  // 괄호 추가
//            return "enroll"; // JSP 또는 Thymeleaf 템플릿 이름
//        } else {
//            model.addAttribute("message", "Only students can enroll in courses.");
//            return "redirect:/login"; // 로그인 페이지로 리다이렉션
//        }
//    }
//
//    @PostMapping("/enroll")
//    public String enrollCourse(@RequestParam("id_student") Long idStudent, @RequestParam("id_program") Long idProgram, Model model, HttpSession session) {
//        User user = (User) session.getAttribute("user");
//        if (user != null && user.getRole().equals("STUDENT")) {
//            courseService.enrollCourse(idStudent, idProgram);
//            model.addAttribute("message", "Successfully enrolled!");
//            return "enroll";
//        } else {
//            model.addAttribute("message", "Only students can enroll in courses.");
//            return "redirect:/login"; // 로그인 페이지로 리다이렉션
//        }
//    }
//}