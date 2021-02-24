package com.kbk.kbk_controller;

import com.kbk.Rest.Restful;
import com.kbk.model.Studio;
import com.kbk.service.StudioService;
import com.kbk.util.ImageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/**
 * @Description
 * @Author 况博凯
 * @Date 2021/02/24 10:14
 * @Version 1.0
 */
@RestController
public class StudioController {
    @Autowired
    private StudioService studioService;

    /**添加工作室简介，5个图片上传，因为multipartFile需要用form-data格式表单处理数据，这里banner就不需要用@RequestBody注解
     *
     * @param multipartFile
     * @param studio
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/api/studio/add",method = RequestMethod.POST)
    @ResponseBody
    /**
     * 注意MultipartFile在这里是数组，上传五张图片
     */
    public Map<String , Object> insertStudio(@RequestParam("uploadFile") MultipartFile[] multipartFile, Studio studio) throws IOException{

        List<String> imagesPathList = new ArrayList<>();
        for (MultipartFile file : multipartFile) {
            // 调用 ImageUtil 类的图片上传方法，返回图片的名字
            String pictureName = ImageUtil.upload(file);
            // 将图片地址添加入list集合中，最多5个地址
            imagesPathList.add(pictureName);
        }
        // 将list集合转为String类型存储数据库
        String picture = String.join("," , imagesPathList);
        studio.setPicture(picture);

        // 将String类型转为list集合，输出查看
        List<String> listString = Arrays.asList(picture.split(","));
        for (String string : listString) {
            System.out.println(string);
        }

        //默认下架架状态
        studio.setStatus(0);
        studio.setCreatedTime(System.currentTimeMillis());
        studio.setUpdatedTime(System.currentTimeMillis());

        studioService.insertSelective(studio);

        if(studio != null){
            return Restful.set(200, "添加work成功", studio);
        }else {
            return Restful.set(404, "添加work失败");
        }
    }
}
