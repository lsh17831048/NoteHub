package com.notehub.service;

import com.notehub.dao.NoteListDAO;
import com.notehub.vo.NoteListVO;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class NoteListServiceImpl implements NoteListService{

    @Inject
    private NoteListDAO noteListDAO;

    @Override
    public List list() throws Exception {
        return noteListDAO.list();
    }
}
