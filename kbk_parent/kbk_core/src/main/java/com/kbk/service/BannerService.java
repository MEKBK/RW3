package com.kbk.service;

import com.kbk.model.Banner;
import org.springframework.stereotype.Service;

import java.util.List;
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
     * @param
     * @return Banner
     */
    int insert(Banner banner);
}
