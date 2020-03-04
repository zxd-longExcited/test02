package com.test.mybatis01;

import com.test.mybatis01.bean.Content;
import com.test.mybatis01.dao.CmsContentDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MybatisTest01 {

    @Test
    public void test01() {
        try {
            InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = builder.build(in);
            SqlSession sqlSession = factory.openSession();
            CmsContentDao dao = sqlSession.getMapper(CmsContentDao.class);
            Content content = dao.getContentWithAttributeById(107295);
            System.out.println(content);

            sqlSession.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test02() {
        try {
            InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = builder.build(in);
            SqlSession sqlSession = factory.openSession();
            CmsContentDao dao = sqlSession.getMapper(CmsContentDao.class);
            for (Content content : dao.getContentBySiteId(107295)) {
                System.out.println(content);
            }
            for (Content content : dao.getContentBySiteId(106972)) {
                System.out.println(content);
            }
            for (Content content : dao.getContentBySiteId(106971)) {
                System.out.println(content);
            }

            sqlSession.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
