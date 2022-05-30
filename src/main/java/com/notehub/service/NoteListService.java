package com.notehub.service;

import com.notehub.vo.NoteListVO;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface NoteListService {
    public List list() throws Exception;
}
