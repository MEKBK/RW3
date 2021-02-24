package com.kbk.service;


import com.kbk.model.Studio;
import org.springframework.stereotype.Service;
/**
 * @Description
 * @Author 况博凯
 * @Date 2021/02/24 10:14
 * @Version 1.0
 */
@Service
public interface StudioService {

    /**
     *  添加数据
     * @param studio
     * @return
     **/
    int insertSelective(Studio studio);
}
