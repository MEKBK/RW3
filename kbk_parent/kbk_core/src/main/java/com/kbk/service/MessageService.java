package com.kbk.service;

import com.kbk.model.Message;
import com.kbk.vo.MessageTestVO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Author 况博凯
 * @Date 2021/02/24 10:14
 * @Version 1.0
 */
@Service
public interface MessageService {
    /**
     * 游客留言的方法
     * @param message
     * @return java.lang.Integer
     */
    int insertMessage(Message message);

    /**
     * 根据作品id查询所有留言
     * @param workId 输入ID
     * @return
     */
    List<MessageTestVO> selectByWorkId(Long workId);

}
