package ir.kalateh.demopetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("vets")
public class VetController {
    
    @RequestMapping({"", "/", "index", "index.html"})
    public String vet() {
        
        return "vet/index";
    }
}