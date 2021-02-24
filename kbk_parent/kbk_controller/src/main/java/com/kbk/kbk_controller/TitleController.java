package com.kbk.kbk_controller;

import com.kbk.Rest.Restful;
import com.kbk.model.Title;
import com.kbk.service.Impl.TitleServiceImpl;
import com.kbk.service.TitleService;
import com.kbk.vo.TitleTestVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
/**
 * @Description
 * @Author 况博凯
 * @Date 2021/02/24 10:14
 * @Version 1.0
 */
@RestController
public class TitleController {
    @Autowired
    private TitleServiceImpl titleService;
    /**
     * get
     * 查询全部
     *
     * @param
     * @return Title
     */
    @GetMapping("/api/title")
    public Map<String, Object> getFirst() {
        //查询全部
        List<TitleTestVo> title = titleService.selectOrTitle();
        if (null == title) {
            return Restful.set(404, "查询title结果为空", title);
        } else {
            return Restful.set(200, "查找title成功", title);
        }

    }


}
