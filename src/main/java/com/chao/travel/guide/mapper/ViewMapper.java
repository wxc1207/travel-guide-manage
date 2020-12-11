package com.chao.travel.guide.mapper;

import com.chao.travel.guide.entity.View;

public interface ViewMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(View record);

    int insertSelective(View record);

    View selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(View record);

    int updateByPrimaryKey(View record);
}