package com.notehub.controller;

import com.notehub.dto.NoteHubDTO;
import com.notehub.service.NoteHubService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.inject.Inject;
import java.util.List;
import java.util.Locale;

@Controller
public class NoteHubController {


    @Inject
    private NoteHubService noteHubService;

    @RequestMapping(value = "/NoteHub", method = RequestMethod.GET)
    public String list(Model model) throws Exception {

        model.addAttribute("boardList", noteHubService.getBoardList());

        return "NoteHubPage";
    }

    @RequestMapping("/CreateNote")
    public String NoteEditView() {
        return "NoteEditPage";
    }

    // RedirectAttributes는 글쓰기 이후 돌아가야 할 페이지에 데이터를 전달
    @RequestMapping(value = "/saveBoard", method = RequestMethod.POST)
    public String saveBoard(@ModelAttribute("NoteHubDTO") NoteHubDTO noteHubDTO, RedirectAttributes redirectAttributes) throws Exception {
        noteHubService.insertBoard(noteHubDTO);
        return "redirect:/NoteHub";
    }
}
