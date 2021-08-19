package ir.kalateh.demopetclinic.controller;

import ir.kalateh.demopetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("vets")
public class VetController {
    
    private final VetService vetService;
    
    public VetController(VetService vetService) {
        this.vetService = vetService;
    }
    
    @RequestMapping({"", "/", "index", "index.html"})
    public String vet(Model model) {
        model.addAttribute("vets", vetService.findAll());
        
        return "vet/index";
    }
}
