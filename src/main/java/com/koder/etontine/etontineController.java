package com.koder.etontine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class etontineController {
       
        @GetMapping({"/","index"})
        public ModelAndView Accueil() {
                ModelAndView modelAndView = new ModelAndView("etontine/index");
                return modelAndView;
        }

        @GetMapping("nos-services")
        public ModelAndView Services() {
                ModelAndView modelAndView = new ModelAndView("etontine/services");
                return modelAndView;
        }

}
