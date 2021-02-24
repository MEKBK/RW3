package com.kbk.service.Impl;

import com.kbk.dao.MessageMapper;
import com.kbk.model.Message;
import com.kbk.model.Title;
import com.kbk.service.MessageService;
import com.kbk.vo.BoyVo;
import com.kbk.vo.MessageTestVO;
import com.kbk.vo.ReplyVo;
import com.kbk.vo.TitleTestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/**
 * @Description
 * @Author 况博凯
 * @Date 2021/02/24 10:14
 * @Version 1.0
 */
@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    MessageMapper messageMapper;


    @Override
    public int insertMessage(Message message) {
        return messageMapper.insertMessage(message);
    }

    @Override
    public List<MessageTestVO> selectByWorkId(Long workId) {
        //根据作品id查询所有留言
        List<Message> messageList = messageMapper.selectByWorkId(workId);

        if (null != messageList && !messageList.isEmpty()) {
            //获取筛选出父类的数据,赋予给 messageParentList
            List<Message> messageParentList = new ArrayList<>();
            for (Message message : messageList) {
                if (message.getReplyId() == 0) {
                    messageParentList.add(message);
                }
            }

            //创建作品的所有留言类容
            List<MessageTestVO> messageTestVOList = new ArrayList<>();

            //将父类的数据（ID,workId）赋予给messageTestVO
            for (Message parentMessage : messageParentList){
                //将父类的数据赋予给 messageTestVOList（游客留言类容）
                MessageTestVO messageTestVO = new MessageTestVO();
                messageTestVO.setId(parentMessage.getId());
                messageTestVO.setWorkId(parentMessage.getWorkId());
                messageTestVO.setTouristName(parentMessage.getTouristName());
                messageTestVO.setContents(parentMessage.getContents());
                messageTestVO.setCreatedTime(parentMessage.getCreatedTime());

                //创建一个回复类容集合，把筛选好的子类集合添加到这个集合里面
                List<ReplyVo> replyVoList= new ArrayList<>();

                for (Message boyMessage : messageList) {
                    if (parentMessage.getId() .equals(boyMessage.getReplyId())) {
                        ReplyVo replyVo = new ReplyVo();
                        replyVo.setId(boyMessage.getId());
                        replyVo.setReplyId(boyMessage.getReplyId());
                        replyVo.setContents(boyMessage.getContents());
                        replyVo.setTouristName(boyMessage.getTouristName());
                        replyVo.setCreatedTime(boyMessage.getCreatedTime());
                        replyVoList.add(replyVo);
                    }
                }

                //将子类的数据（ID和Name）赋予给父类的  boyVoList
                messageTestVO.setReplyVo(replyVoList);
                //将父类对象的数据赋予的父类
                messageTestVOList.add(messageTestVO);

            }
            System.out.println("=============================="+messageTestVOList);
            return messageTestVOList;

        }else {
            return null;
        }

    }
}