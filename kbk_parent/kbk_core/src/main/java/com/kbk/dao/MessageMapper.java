package com.kbk.dao;

import com.kbk.model.Message;

public interface MessageMapper {
    /**
     * 游客留言添加
     * @param message
     * @return java.lang.Integer
     */
    int insertMessage(Message message);
}