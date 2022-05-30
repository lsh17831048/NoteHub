package com.notehub.dao;

import com.notehub.vo.NoteListVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.List;

@Repository
public class NoteListDAOImpl implements NoteListDAO{

    @Inject
    private SqlSession sqlSession;

    private static String namespace = "com.notehub.mapper.boardMapper";

    @Override
    public List list() throws Exception {
        return sqlSession.selectList(namespace + ".list");
    }
}
