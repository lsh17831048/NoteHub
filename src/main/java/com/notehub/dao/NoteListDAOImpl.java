package com.notehub.dao;

import com.notehub.vo.NoteListVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NoteListDAOImpl implements NoteListDAO{

    private SqlSession sqlSession;

    @Override
    public List<NoteListVO> getNoteList() throws Exception {
        return sqlSession.selectList("com.noteHub.mapper.boardMapper.getNoteList");
    }

    @Override
    public NoteListVO getNoteListContent(int noteList_num) throws Exception {
        return null;
    }

    @Override
    public int insertNoteList(NoteListVO noteListVO) throws Exception {
        return 0;
    }

    @Override
    public int updateNoteList(NoteListVO noteListVO) throws Exception {
        return 0;
    }

    @Override
    public int deleteNoteList(int noteList_num) throws Exception {
        return 0;
    }

    @Override
    public int updateViewCount(int noteList_num) throws Exception {
        return 0;
    }
}
