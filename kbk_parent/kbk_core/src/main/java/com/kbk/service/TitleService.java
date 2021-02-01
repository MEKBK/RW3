package com.kbk.service;

import com.kbk.dao.TitleMapper;
import com.kbk.model.Title;
import com.kbk.vo.TitleTestVo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface TitleService {
    /**
     * 查询全部
     * @param
     * @return Title
     */
    List<TitleTestVo> selectOrTitle();
}
