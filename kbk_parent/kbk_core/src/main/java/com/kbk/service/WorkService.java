package com.kbk.service;

import com.kbk.model.Work;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface WorkService {
    /**
     *多字段模糊查询
     * @Param [keyword]
     * @return java.util.List<com.jnshu.pojo.Works>
     **/
    List<Work> selectByCondition(Work work);

    /**
     * 根据ID查询所有
     * @param id
     * @return
     */
    Work selectWorksById(Long id);
}
