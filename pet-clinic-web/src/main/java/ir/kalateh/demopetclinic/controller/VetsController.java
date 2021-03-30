package ir.kalateh.demopetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vets")
public class VetsController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOfVets(Model model) {

        return "vets/index";
    }
}
