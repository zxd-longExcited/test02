package com.test.mybatis01.dao;

import com.test.mybatis01.bean.Content;

import java.util.List;

public interface CmsContentDao {

    Content getContentWithAttributeById(int id);

    List<Content> getContentByParentId(int siteId);
}
