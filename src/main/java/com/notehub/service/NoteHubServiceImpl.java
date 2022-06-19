package com.notehub.service;

import com.notehub.dao.NoteHubDAO;
import com.notehub.dto.NoteHubDTO;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;
import java.util.Map;

@Service
public class NoteHubServiceImpl implements NoteHubService {

    @Inject
    private NoteHubDAO noteHubDAO;

    @Override
    public List<NoteHubDTO> getBoardList() throws Exception {
        return noteHubDAO.getBoardList();
    }


    @Override
    public Map<String, Object> insertBoard(NoteHubDTO noteHubDTO) throws Exception {
        noteHubDAO.insertBoard(noteHubDTO);
        return null;
    }
}
