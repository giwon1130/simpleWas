package com.example.simplewas;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
public class MainController {

    @RequestMapping("/map")
    public String index(Model model) {
        model.addAttribute("data", "hello rogie!!");
        return "main/index";
    }
    @GetMapping("/test")
    public String test(Model model) {
        model.addAttribute("data", "hello rogie!!");
        return "test";
    }
}
