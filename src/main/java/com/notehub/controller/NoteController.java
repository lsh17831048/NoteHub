package com.notehub.controller;

import com.notehub.service.NoteHubService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@Controller
@RequestMapping(value = "/CreateNote/*")
public class NoteController {

    @Inject
    private NoteHubService noteHubService;

    @RequestMapping(value = "/")
    public String CreateNoteView() {
        return "NoteEditPage";
    }

}
