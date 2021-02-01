package com.kbk.service;


import com.kbk.service.Impl.BannerServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

// 让测试运行于spring测试环境
@RunWith(SpringJUnit4ClassRunner.class)
// 指定 Spring 配置文件所在的位置
@ContextConfiguration(locations = "classpath:spring-mybatis.xml")
public class BannerServiceTest {

    // 也可用 @Autowired
    @Resource
    private BannerServiceImpl bannerService;

    /**
     *
     */
    @Test
    public void testSelectBannerList() throws Exception {
        System.out.println(bannerService.selectBannerList());
    }
}