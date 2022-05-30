package com.notehub.controller;

import com.notehub.service.NoteListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;
import java.util.List;
import java.util.Locale;

@Controller
public class NoteListController {


    @Inject
    private NoteListService noteListService;

    @RequestMapping(value = "/NoteHubPage", method = RequestMethod.GET)
    public void list(Locale locale, Model model) throws Exception {
        List list = noteListService.list();
        model.addAttribute("list", list);
    }
}
