package com.notehub.dao;

import com.notehub.dto.NoteHubDTO;

import java.util.List;

public interface NoteHubDAO {

    public List<NoteHubDTO> getBoardList() throws Exception;

    public NoteHubDTO getBoardContent(int nh_num) throws Exception;

    public int insertBoard(NoteHubDTO noteHubDTO) throws Exception;

    public int updateBoard(NoteHubDTO noteHubDTO) throws Exception;

    public int deleteBoard(int nh_num) throws Exception;

    public int updateViewCnt(int nh_num) throws Exception;
}
