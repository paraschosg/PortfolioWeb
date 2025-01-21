package org.example.portfolioweb.Controller;

import org.example.portfolioweb.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private PortfolioService portfolioService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Home - Portfolio");
        return "index";
    }

    @GetMapping("/error")
    public String error(Model model) {
        model.addAttribute("title", "Error");
        return "error";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "About Me");
        return "about";
    }

    @GetMapping("/projects")
    public String projects(Model model) {
        model.addAttribute("title", "Projects");
        return "projects";
    }
}
