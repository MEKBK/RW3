package com.kbk.dao;

import com.kbk.model.Title;

import java.util.List;

public interface TitleMapper {
    /**
     * 查询全部
     * @param
     * @return Title
     */
    List<Title> selectFirst();
}