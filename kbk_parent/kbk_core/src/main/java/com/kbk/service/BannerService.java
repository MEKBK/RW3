package com.kbk.service;

import com.kbk.model.Banner;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author 况博凯
 * @Date 2021/02/24 10:14
 * @Version 1.0
 */
@Service
public interface BannerService {
    /**
     * 查找banner列表
     * @param
     * @return Banner
     */
    List<Banner> selectBannerList();

    /**
     * 添加banner列表
     * @param banner
     * @return Banner
     */
    boolean insertSelective(Banner banner);
    /**
     * 根据Banner状态，是否上架，查询Banner原图
     *
     *
     * @param status
     * @return Banner
     */
    List<Banner> selectBannerByStatus(Boolean status);
}
