package com.koder.etontine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import com.koder.etontine.Models.User;
import com.koder.etontine.services.AuthService;

@Controller
public class AuthController {
@Autowired
AuthService authService;

    @GetMapping("/login")
        public ModelAndView renderLoginView() {
                ModelAndView modelAndView = new ModelAndView("etontine/Login");
                return modelAndView;
        }

        @GetMapping("/register")
        public ModelAndView renderRegisterView() {
                User user = new User();
                ModelAndView modelAndView = new ModelAndView("etontine/register");
                modelAndView.addObject("user", user);
                return modelAndView;
        }
        @PostMapping("/")
        public ModelAndView saveUser(@ModelAttribute User newUser){
                ModelAndView modelAndView = new ModelAndView("etontine/index");
                authService.saveUser(newUser);
                modelAndView.addObject("RegistrationSuccess", true);
                return modelAndView;
        }
}
