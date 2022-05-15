package com.notehub.main;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    
    // 메인 페이지 이동
    @RequestMapping(value = "/")
    public String main() {
        logger.debug("메인 페이지 진입");
        return "MainPage";
    }

    @RequestMapping(value = "/NoteEditPage")
    public String editPage() {
        logger.debug("노트 작성 페이지 진입");
        return "/WEB-INF/views/NoteEditPage.html";
    }
}
