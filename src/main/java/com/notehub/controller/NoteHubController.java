package com.notehub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Locale;

@Controller
@RequestMapping(value = "/NoteHub/*")
public class NoteHubController {

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public void list(Locale locale, Model model) {

    }
}
