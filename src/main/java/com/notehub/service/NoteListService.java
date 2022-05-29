package com.notehub.service;

import com.notehub.vo.NoteListVO;

import java.util.List;

public interface NoteListService {
    public List<NoteListVO> getNoteList() throws Exception;
}
