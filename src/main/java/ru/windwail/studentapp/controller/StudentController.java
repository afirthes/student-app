package ru.windwail.studentapp.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    @GetMapping(value = {"/"})
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }

    @GetMapping(value = {"/home"})
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("home");
        return modelAndView;
    }

    @GetMapping(value = {"/manage"})
    @PreAuthorize("hasAuthority('PROFESSOR')")
    public ModelAndView manage() {
        ModelAndView modelAndView = new ModelAndView("manage");
        return modelAndView;
    }

    @GetMapping(value = {"/denied"})
    public ModelAndView denied() {
        ModelAndView modelAndView = new ModelAndView("denied");
        return modelAndView;
    }

    @GetMapping(value = {"/contacts"})
    public ModelAndView contacts() {
        ModelAndView modelAndView = new ModelAndView("contacts");
        return modelAndView;
    }


}
