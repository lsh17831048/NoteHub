package com.notehub.dao;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

// 인터페이스를 생성하여 메서드를 오버 라이딩해서 사용
// DAO와 Service가 각각 로직이 수정되어도 영향이 가지 않도록 분리해서 사용한다.
public class NoteHubDAOImpl implements NoteHubDAO {

    private SqlSession sqlSession;

    private static String namespace = "com.notehub.mapper.board";

    @Override
    public List list() throws Exception {
        return sqlSession.selectList(namespace + ".list");
    }
}
