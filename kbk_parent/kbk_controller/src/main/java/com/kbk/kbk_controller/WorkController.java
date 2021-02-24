package com.kbk.kbk_controller;

import com.kbk.Rest.Restful;

import com.kbk.model.Banner;
import com.kbk.model.Work;

import com.kbk.service.WorkService;
import com.kbk.util.ImageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;
import java.util.Map;
/**
 * @Description
 * @Author 况博凯
 * @Date 2021/02/24 10:14
 * @Version 1.0
 */
@RestController
public class WorkController {
    @Autowired
    private WorkService workService;

    /**
     * get
     * 查询work列表接口
     *
     * @return work
     */
    @GetMapping("/api/work/{id}")
    public Map<String, Object> work(@PathVariable Long id) {
        Work work = workService.selectWorksById(id);
        if (work != null) {
            return Restful.set(200, "查询work成功", work);

        } else {
            return Restful.set(404, "查询work结果为空", work);
        }
    }

    /** 添加banner接口，因为multipartFile需要用form-data格式表单处理数据，这里banner就不需要用@RequestBody注解
     *
     * @param multipartFile
     * @param work
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/api/work/add",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> insertWork(@RequestParam("uploadFile") MultipartFile multipartFile, Work work) throws IOException {
        // 调用 ImageUtil 类的图片上传方法，返回图片的名字
        String coverName = ImageUtil.upload(multipartFile);
        work.setPicture(coverName);

        //默认下架架状态
        work.setStatus(0);
        work.setCreatedTime(System.currentTimeMillis());
        work.setUpdatedTime(System.currentTimeMillis());

        workService.insertSelective(work);

        if(work != null){
            return Restful.set(200, "添加work成功", work);
        }else {
            return Restful.set(404, "添加work失败");
        }
    }
}
