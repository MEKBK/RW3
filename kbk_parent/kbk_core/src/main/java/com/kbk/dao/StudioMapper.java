package com.kbk.dao;

import com.kbk.model.Studio;
/**
 * @Description
 * @Author 况博凯
 * @Date 2021/02/24 10:14
 * @Version 1.0
 */
public interface StudioMapper {



    /**
     *  添加数据
     * @param studio 输入参数
     * @return
     **/
    int insertSelective(Studio studio);


}