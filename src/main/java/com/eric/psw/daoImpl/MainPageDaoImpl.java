package com.eric.psw.daoImpl;

import com.eric.psw.dao.MainPageDao;
import com.eric.psw.model.MainPageModel;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by eric on 15-8-25.
 */
@Repository("mainDao")
public class MainPageDaoImpl implements MainPageDao {

    @Autowired
    private SqlSessionFactory sessionFactory;

    private SqlSession sqlSession;

    public SqlSession getSqlSession() {
        if(sqlSession == null){
            sqlSession = sessionFactory.openSession();
        }
        return sqlSession;
    }

    public void add(MainPageModel model) {
        this.getSqlSession().insert("mainPage.insertMain", model);
    }
}
