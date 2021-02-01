package com.kbk.kbk_controller;

import com.kbk.Rest.Restful;
import com.kbk.model.Banner;
import com.kbk.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;


@RestController
public class BannerController {
    @Autowired
    private BannerService bannerService;

    /**
     * get
     * 查询banner列表接口
     *
     * @return banner
     */
   @GetMapping("/api/banner")
    public Map<String, Object> showBanner() {
        List<Banner> banner = bannerService.selectBannerList();
        if (banner != null && !banner.isEmpty()) {
            return Restful.set(200, "查询banner成功", banner);

        } else {
            return Restful.set(404, "查询banner失败");
        }
    }
}
