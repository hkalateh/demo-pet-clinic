package ir.kalateh.demopetclinic.controller;

import ir.kalateh.demopetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("owners")
public class OwnerController {
    
    private final OwnerService ownerService;
    
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }
    
    @RequestMapping({"", "/", "index", "index.html"})
    public String owner(Model model) {
        
        model.addAttribute("owners", ownerService.findAll());
        return "owner/index";
    }
    
    @RequestMapping("find")
    public String findOwner(){
        return "notImplemented";
    }
}
