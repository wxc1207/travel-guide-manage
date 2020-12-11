package com.chao.travel.guide.mapper;

import com.chao.travel.guide.entity.Guide;

public interface GuideMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Guide record);

    int insertSelective(Guide record);

    Guide selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Guide record);

    int updateByPrimaryKey(Guide record);
}