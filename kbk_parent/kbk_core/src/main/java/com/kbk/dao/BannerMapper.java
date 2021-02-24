package com.kbk.dao;

import com.kbk.model.Banner;

import java.util.List;

/**
 * @Description
 * @Author 况博凯
 * @Date 2021/02/24 10:14
 * @Version 1.0
 */
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
     * @param banner 传入的参数
     * @return Banner
     */
    int insertSelective(Banner banner);
    /**
     * 根据Banner状态，是否上架，查询Banner原图
     *
     * @param status 上架状态
     * @return Banner
     */
    List<Banner> selectBannerByStatus(Boolean status);
}