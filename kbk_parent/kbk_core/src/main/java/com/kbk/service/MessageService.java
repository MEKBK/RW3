package com.kbk.service;

import com.kbk.model.Message;
import org.springframework.stereotype.Service;

@Service
public interface MessageService {
    /**
     * 游客留言的方法
     * @param message
     * @return java.lang.Integer
     */
    int insertMessage(Message message);
}
