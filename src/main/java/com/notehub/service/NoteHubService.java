package com.notehub.service;

import com.notehub.dto.NoteHubDTO;

import java.util.List;

public interface NoteHubService {

    public List<NoteHubDTO> getBoardList() throws Exception;

    public void insertBoard(NoteHubDTO noteHubDTO) throws Exception;
}
