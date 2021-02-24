package com.kbk.service.Impl;

import com.kbk.dao.BannerMapper;
import com.kbk.model.Banner;
import com.kbk.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @Description
 * @Author 况博凯
 * @Date 2021/02/24 10:14
 * @Version 1.0
 */
@Service
public class BannerServiceImpl implements BannerService {
    @Autowired
    BannerMapper bannerMapper;

    @Override
    public List<Banner> selectBannerList() {
        return bannerMapper.selectBannerList();
    }

    @Override
    public boolean insertSelective(Banner banner){
        int i = bannerMapper.insertSelective(banner);
        if(i>0){
            return true;
        }
        return false;
    }

    @Override
    public List<Banner> selectBannerByStatus(Boolean status) {
        List<Banner> banners = bannerMapper.selectBannerByStatus(status);
        return banners;
    }
}
