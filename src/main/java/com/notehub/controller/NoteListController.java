package com.notehub.controller;

import com.notehub.service.NoteListService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NoteListController {

    private NoteListService noteListService;

    @RequestMapping(value = "NoteHub")
    public String getNoteList(Model model) throws Exception {
        //model.addAttribute("NoteList", noteListService.getNoteList());
        return "NoteHubPage";
    }
}
