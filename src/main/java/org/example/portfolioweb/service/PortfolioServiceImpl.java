package org.example.portfolioweb.service;

import org.example.portfolioweb.model.Project;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class PortfolioServiceImpl implements PortfolioService {

    @Override
    public List<Project> getAllProjects() {
        return Arrays.asList(
                new Project("Portfolio Website", "A personal portfolio website built using Spring Boot.", "https://portfolio.com"),
                new Project("E-commerce App", "A sample e-commerce application.", "https://ecommerce.com")
        );
    }
}