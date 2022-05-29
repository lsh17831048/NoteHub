package com.notehub.service;

import com.notehub.dao.NoteListDAO;
import com.notehub.vo.NoteListVO;

import java.util.List;

public class NoteListServiceImpl implements NoteListService{

    private NoteListDAO noteListDAO;

    @Override
    public List<NoteListVO> getNoteList() throws Exception {
        return noteListDAO.getNoteList();
    }
}
