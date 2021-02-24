package com.kbk.kbk_controller;

import com.kbk.Rest.Restful;
import com.kbk.model.Banner;
import com.kbk.service.BannerService;
import com.kbk.util.ImageUtil;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @Description
 * @Author 况博凯
 * @Date 2021/02/24 10:14
 * @Version 1.0
 */
@RestController
public class BannerController {
    @Autowired
    private BannerService bannerService;


    /**
     * 添加banner接口，因为multipartFile需要用form-data格式表单处理数据，这里banner就不需要用@RequestBody注解
     *
     * @param multipartFile
     * @param banner
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/api/banner/add",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> insertBanner(@RequestParam("uploadFile")MultipartFile multipartFile,Banner banner) throws IOException {
        // 调用 ImageUtil 类的图片上传方法，返回图片的名字
        String coverName = ImageUtil.upload(multipartFile);

        banner.setCover(coverName);

        banner.setStatus(false);
        banner.setCreatedTime(System.currentTimeMillis());
        banner.setUpdateTime(System.currentTimeMillis());

        Boolean flag = bannerService.insertSelective(banner);

        if(flag){
            return Restful.set(200, "查询banner成功", banner);
        }else {
            return Restful.set(404, "查询banner结果为空",banner);
        }
    }

    /**
     * get
     * 查询banner列表接口
     *
     * @return banner
     */
   @GetMapping("/api/banner")
    public Map<String, Object> showBanner() {
        List<Banner> banner = bannerService.selectBannerList();
       if (banner != null && !banner.isEmpty()) {
            return Restful.set(200, "查询banner成功", banner);

        } else {
            return Restful.set(404, "查询banner结果为空",banner);
        }
    }


//    // 单个图片上传
//    @RequestMapping(value = "/uploadFile")
//    // 使用HttpServletRequest需导入javax.servlet-api-4.0.1.jar
//    // 上传的文件自动绑定到MultipartFile中
//    public ModelAndView uploadFile(@RequestParam("uploadFile") MultipartFile uploadFile , HttpServletRequest request , ModelAndView mav) throws IOException {
//        mav.setViewName("uploadFile");
//        // 判断文件是否成功上传
//        if(uploadFile!=null){
//            // 指定上传图片的保存路径
//            String path=request.getServletContext().getRealPath("/image/");
//            // 获取上传的文件名全称
//            String fileName=uploadFile.getOriginalFilename();
//            // 获取上传文件的后缀名
//            String suffix=fileName.substring(fileName.lastIndexOf("."));
//            // 给文件定义一个新的名称,杜绝文件重名覆盖现象
//            String newFileName= UUID.randomUUID().toString()+suffix;
//
//            // 创建File对象,注意这里不是创建一个目录或一个文件,你可以理解为是 获取指定目录中文件的管理权限(增改删除判断等 . . .)
//            File tempFile=new File(path);
//            // 判断File对象对应的目录是否存在
//            if(!tempFile.exists()){
//                // 创建以此抽象路径名命名的目录,注意mkdir()只能创建一级目录,所以它的父级目录必须存在
//                tempFile.mkdir();
//            }
//
//            // 在指定路径中创建一个文件(该文件是空的)
//            File file=new File("D:\\repository\\SpringMVCLayer\\kbk_parent\\kbk_controller\\src\\main\\webapp\\image" + newFileName);
//            // 将上传的文件写入指定文件
//            uploadFile.transferTo(file);
//
//            // 将新文件名添加到HttpServletRequest
//            request.setAttribute("newFileName",newFileName);
//        }
//        return mav;
//    }
}
