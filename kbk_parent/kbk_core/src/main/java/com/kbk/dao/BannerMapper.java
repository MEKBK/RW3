package com.kbk.dao;

import com.kbk.model.Banner;

import java.util.List;

public interface BannerMapper {
    /**
     * 查找banner列表
     * @param
     * @return Banner
     */
    List<Banner> selectBannerList();

    /**
     * 添加banner列表
     *
     *
     * @param
     * @return Banner
     */
    int insert(Banner banner);
}