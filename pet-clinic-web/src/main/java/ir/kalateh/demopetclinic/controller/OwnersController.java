package ir.kalateh.demopetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnersController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOfOwners(Model model) {

        return "owners/index";
    }
}
