package com.chao.travel.guide.mapper;

import com.chao.travel.guide.entity.TravelNotes;

public interface TravelNotesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TravelNotes record);

    int insertSelective(TravelNotes record);

    TravelNotes selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TravelNotes record);

    int updateByPrimaryKey(TravelNotes record);
}