package com.kbk.service;

import com.kbk.vo.TitleTestVo;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @Description
 * @Author 况博凯
 * @Date 2021/02/24 10:14
 * @Version 1.0
 */
@Service
public interface TitleService {
    /**
     * 查询全部
     * @param
     * @return Title
     */
    List<TitleTestVo> selectOrTitle();
}
