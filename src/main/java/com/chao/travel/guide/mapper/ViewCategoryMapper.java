package com.chao.travel.guide.mapper;

import com.chao.travel.guide.entity.ViewCategory;

public interface ViewCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ViewCategory record);

    int insertSelective(ViewCategory record);

    ViewCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ViewCategory record);

    int updateByPrimaryKey(ViewCategory record);
}