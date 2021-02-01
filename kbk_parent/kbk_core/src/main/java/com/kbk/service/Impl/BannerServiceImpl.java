package com.kbk.service.Impl;

import com.kbk.dao.BannerMapper;
import com.kbk.model.Banner;
import com.kbk.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BannerServiceImpl implements BannerService {
    @Autowired
    BannerMapper bannerMapper;

    @Override
    public List<Banner> selectBannerList() {
        return bannerMapper.selectBannerList();
    }

    @Override
    public int insert(Banner banner){
        return bannerMapper.insert(banner);
    }
}
