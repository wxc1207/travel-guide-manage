package com.chao.travel.guide.mapper;

import com.chao.travel.guide.entity.GuideCategory;

public interface GuideCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GuideCategory record);

    int insertSelective(GuideCategory record);

    GuideCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GuideCategory record);

    int updateByPrimaryKey(GuideCategory record);
}