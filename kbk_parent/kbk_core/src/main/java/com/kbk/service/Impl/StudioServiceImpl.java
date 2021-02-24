package com.kbk.service.Impl;

import com.kbk.dao.StudioMapper;
import com.kbk.model.Studio;
import com.kbk.service.StudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @Description
 * @Author 况博凯
 * @Date 2021/02/24 10:14
 * @Version 1.0
 */
@Service
public class StudioServiceImpl implements StudioService {
    @Autowired
    StudioMapper studioMapper;

    @Override
    public int insertSelective(Studio studio){
        return studioMapper.insertSelective(studio);
    }
}
