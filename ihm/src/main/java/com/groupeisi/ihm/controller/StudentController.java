package com.groupeisi.ihm.controller;

import com.groupeisi.metier.service.IStudentService;
import com.groupeisi.metier.service.impl.StudentServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class StudentController {
    @Autowired
    private IStudentService studentService;
    private Logger logger = LoggerFactory.getLogger(StudentController.class);

    @GetMapping("/")
    public String index(Model model) {
        logger.info("Matricule : {}", studentService.get("DK123").getMatricule());
        model.addAttribute("student", studentService.get("DK123").getMatricule());
        return "index";
    }

    @GetMapping("/save")
    public String save() {
        return "save";
    }

    @GetMapping("/find")
    public String find() {
        return "find";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
