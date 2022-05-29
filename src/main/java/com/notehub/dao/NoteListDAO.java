package com.notehub.dao;

import com.notehub.vo.NoteListVO;

import java.util.List;

public interface NoteListDAO {

    public List<NoteListVO> getNoteList() throws Exception;

    public NoteListVO getNoteListContent(int noteList_num) throws Exception;

    public int insertNoteList(NoteListVO noteListVO) throws Exception;

    public int updateNoteList(NoteListVO noteListVO) throws  Exception;

    public int deleteNoteList(int noteList_num) throws Exception;

    public int updateViewCount(int noteList_num) throws Exception;
}
