package com.notehub.dao;

import com.notehub.vo.NoteListVO;

import java.util.List;

public interface NoteListDAO {

    public List list() throws Exception;
}
