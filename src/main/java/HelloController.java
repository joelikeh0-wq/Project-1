package pl.edu.vistula.first_project_java_spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HelloController{

    @GetMapping("/hello")
    public String hello(Model model) {

        model.addAttribute("name", "Summer is coming!!");
        return "greeting";

    }
}









