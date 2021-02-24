package com.kbk.service.Impl;

import com.kbk.dao.WorkMapper;
import com.kbk.model.Work;
import com.kbk.service.WorkService;
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
public class WorkServiceImpl implements WorkService {
    @Autowired
    WorkMapper workMapper;

    @Override
    public int insertSelective(Work work){return workMapper.insertSelective(work);}

    @Override
    public Work selectWorksById(Long id){return workMapper.selectWorksById(id);}

}
