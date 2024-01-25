package com.collaboration.collab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SiteController {
    
    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
}
