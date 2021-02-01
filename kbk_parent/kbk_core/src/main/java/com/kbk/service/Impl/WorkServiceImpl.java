package com.kbk.service.Impl;

import com.kbk.dao.WorkMapper;
import com.kbk.model.Work;
import com.kbk.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WorkServiceImpl implements WorkService {
    @Autowired
    WorkMapper workMapper;

    @Override
    public List<Work> selectByCondition(Work work){return workMapper.selectByCondition(work);}

    @Override
    public Work selectWorksById(Long id){return workMapper.selectWorksById(id);}

}
