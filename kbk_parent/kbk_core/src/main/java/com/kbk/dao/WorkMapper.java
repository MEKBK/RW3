package com.kbk.dao;

import com.kbk.model.Work;

import java.util.List;
/**
 * @Description
 * @Author 况博凯
 * @Date 2021/02/24 10:14
 * @Version 1.0
 */

public interface WorkMapper {
    /**
     *  添加数据
     * @param work
     * @return
     **/
    int insertSelective(Work work);

    /**
     * 根据ID查询所有
     * @param id
     * @return
     */
    Work selectWorksById(Long id);
}