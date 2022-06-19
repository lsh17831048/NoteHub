package com.notehub.dao;

import com.notehub.dto.NoteHubDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.List;

// 인터페이스를 생성하여 메서드를 오버 라이딩해서 사용
// DAO와 Service가 각각 로직이 수정되어도 영향이 가지 않도록 분리해서 사용한다.
@Repository
public class NoteHubDAOImpl implements NoteHubDAO {

    @Inject
    private SqlSession sqlSession;

    private String NAMESPACE = "notehub";

    @Override
    public List<NoteHubDTO> getBoardList() throws Exception {
        return sqlSession.selectList(NAMESPACE + ".getBoardList");
    }

    @Override
    public NoteHubDTO getBoardContent(int nh_num) throws Exception {
        return sqlSession.selectOne(NAMESPACE + ".getBoardContent", nh_num);
    }

    @Override
    public int insertBoard(NoteHubDTO noteHubDTO) throws Exception {
        return sqlSession.insert(NAMESPACE + ".insertBoard", noteHubDTO);
    }

    @Override
    public int updateBoard(NoteHubDTO noteHubDTO) throws Exception {
        return sqlSession.update(NAMESPACE + ".updateBoard", noteHubDTO);
    }

    @Override
    public int deleteBoard(int nh_num) throws Exception {
        return sqlSession.insert(NAMESPACE + ".deleteBoard", nh_num);
    }

    @Override
    public int updateViewCnt(int nh_num) throws Exception {
        return sqlSession.update(NAMESPACE + ".updateViewCnt", nh_num);
    }
}
