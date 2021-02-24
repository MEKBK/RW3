package com.kbk.kbk_controller;

import com.kbk.Rest.Restful;
import com.kbk.model.Message;
import com.kbk.service.Impl.MessageServiceImpl;
import com.kbk.service.MessageService;
import com.kbk.vo.MessageTestVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * @Description
 * @Author 况博凯
 * @Date 2021/02/24 10:14
 * @Version 1.0
 */
@RestController
public class MessageController {
    @Autowired
    private MessageServiceImpl messageService;
    /**
     * post
     * 添加留言
     *
     * @param message
     * @return
     */
    @RequestMapping(value = "/api/message", method = RequestMethod.POST, consumes = "application/json")


    /**
     * @ResponseBody 是将下面方法返回的参数（一般地, 返回的数据不是某个具体的视图页面, 而是某种格式的数据(json, xml等)），
     * 转换为指定格式后, 写入到response对象的的body数据区。因为开启了springMVC的注解驱动，所以返回的是json格式的数据
     *
     * 告诉spring-mvc框架  不进行视图跳转（不用跳到jsp去）   直接进行数据响应（直接返回当前数据）
     */
    public Map<String, Object> postContents(@RequestBody Message message) {
        //@RequestBody 用于读取request请求的body部分的数据（浏览器传输过来的），解析后，把相应的数据绑定到请求处理方法的参数上

        //判断某字符串是否为空或长度为0或由空白符(whitespace) 构成

        if (StringUtils.isBlank(message.getContents())) {
            return Restful.set(404,"留言已添加");
        } else {
            message.setCreatedTime(System.currentTimeMillis());
            message.setUpdatedTime(System.currentTimeMillis());
            messageService.insertMessage(message);
            return Restful.set(200, "添加成功", message);
        }

    }

    // 根据作品id查询对应的留言、回复，递归遍历，前端返回作品id
    @RequestMapping(value = "/api/message/{workId}",method = RequestMethod.GET)
    @ResponseBody
    /**
     * @PathVariable,用于将请求URL中的模板变量映射到功能处理方法的参数上，即取出uri模板中的变量作为参数。
     */
    public Map<String,Object> selectMessageByWorkId(@PathVariable(value = "workId") Long workId){
        List<MessageTestVO> message = messageService.selectByWorkId(workId);
        if (null != message) {
            return Restful.set(200, "查找message成功", message);
        } else {
            return Restful.set(404, "查询message结果为空", message);
        }


    }

}
