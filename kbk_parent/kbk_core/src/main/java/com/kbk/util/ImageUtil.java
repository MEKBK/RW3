package com.kbk.util;


import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.*;
/**
 * @Description
 * @Author 况博凯
 * @Date 2021/02/24 10:14
 * @Version 1.0
 */
public class ImageUtil {

    /** 上传图片，尝试后发现视频也可以上传
     *
     * @param pictureFile
     * @return
     * @throws IOException
     */
    public static String upload(MultipartFile pictureFile) throws IOException {
        // 装配图片地址
        String imgPath = null;
        // 判断pictureFile不为空，则上传图片
        if (pictureFile != null) {
            // 设置图片上传路径，我是将图片存在本地的文件夹中
         //   String path = "D:\\repository\\SpringMVCLayer\\kbk_parent\\kbk_controller\\src\\main\\webapp\\images123";
            String path = "/usr/local/tomcat/apache-tomcat-9.0.40/webapps/";
            // 获取上传的文件名全称
            String fileName=pictureFile.getOriginalFilename();
            // 获取上传文件的后缀名
            String suffix=fileName.substring(fileName.lastIndexOf("."));

            // 使用 UUID 给图片重命名，并去掉四个“-”
            String newFileName = UUID.randomUUID().toString().replaceAll("-", "")+suffix;

            // 检验文件夹是否存在，不存在则创建一个文件夹，即路径必须正确
            isFolderExists(path);

            // 将重名命后的图片上传到图片上传路径
            pictureFile.transferTo(new File(path, newFileName));
            // 装配后的图片地址，包含图片名称、后缀，若使用nginx代理，则不加虚拟路径
            imgPath = newFileName;


        }

        return imgPath;
    }

    /** 验证文件夹是否存在，不存在则创建一个文件夹，即路径必须正确
     *
     * @param path
     * @return
     */
    public static boolean isFolderExists(String path) {
        File file = new File(path);
        boolean mkdir = file.mkdir();
        if(mkdir){
            System.out.println("创建成功");
        }else {
            System.out.println("创建失败");
        }


        return true;

    }
}

