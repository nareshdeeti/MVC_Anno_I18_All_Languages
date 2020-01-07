package com.t7.controller;

import com.t7.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Locale;

@Controller
public class ListOfAllLanguages {
    @Autowired
    private LanguageService service;
    @RequestMapping("lang.htm")
    public ModelAndView process(){
        Locale[] localesl =service.allLanguages();
        return new ModelAndView("lang","locale",localesl);
    }
}
