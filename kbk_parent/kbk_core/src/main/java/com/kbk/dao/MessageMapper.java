package com.kbk.dao;

import com.kbk.model.Message;

import java.util.List;
/**
 * @Description
 * @Author 况博凯
 * @Date 2021/02/24 10:14
 * @Version 1.0
 */
public interface MessageMapper {
    /**
     * 游客留言添加
     * @param message
     * @return
     */
    int insertMessage(Message message);

    /**
     * 根据作品id查询所有留言
     * @param workId 输入ID
     * @return
     */
    List<Message> selectByWorkId(Long workId);



}