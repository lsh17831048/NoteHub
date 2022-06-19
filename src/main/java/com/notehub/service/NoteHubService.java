package com.notehub.service;

import com.notehub.dto.NoteHubDTO;

import java.util.List;
import java.util.Map;

public interface NoteHubService {

    public List<NoteHubDTO> getBoardList() throws Exception;

    public Map<String, Object> insertBoard(NoteHubDTO noteHubDTO) throws Exception;
}
