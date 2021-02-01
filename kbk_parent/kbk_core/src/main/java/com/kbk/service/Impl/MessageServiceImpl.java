package com.kbk.service.Impl;

import com.kbk.dao.MessageMapper;
import com.kbk.model.Message;
import com.kbk.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    MessageMapper messageMapper;


    @Override
    public int insertMessage(Message message) {
        return  messageMapper.insertMessage(message);
    }
}
