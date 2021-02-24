package com.kbk.service.Impl;

import com.kbk.dao.TitleMapper;
import com.kbk.model.Title;
import com.kbk.service.TitleService;
import com.kbk.vo.BoyVo;
import com.kbk.vo.TitleTestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author 况博凯
 * @Date 2021/02/24 10:14
 * @Version 1.0
 */
@Service
public class TitleServiceImpl implements TitleService {
    @Autowired
    TitleMapper titleMapper;


    @Override
    public List<TitleTestVo> selectOrTitle() {
        //获取数据库的内容
        List<Title> titleList = titleMapper.selectFirst();

        if (null != titleList && !titleList.isEmpty()) {
            //获取筛选出父类的数据,赋予给 titleParentList
            List<Title> titleParentList = new ArrayList<>();
            for (Title title : titleList) {
                if (title.getParentId() == 0) {
                    titleParentList.add(title);
                }
            }

            //这是创建一整个导航栏对象（包含父类和子类一起）
            List<TitleTestVo> titleTestVoList = new ArrayList<>();

            //将父类的数据（ID,Name）赋予给TitleTestVo
            for (Title parentTitle : titleParentList) {
                //将数据库的内容赋予给 TitleTestVo（整个导航栏对象）
                TitleTestVo titleTestVo = new TitleTestVo();
                titleTestVo.setId(parentTitle.getId());
                titleTestVo.setName(parentTitle.getName());

                //创建一个子级导航栏集合，把筛选好的子类集合添加到这个集合里面
                List<BoyVo> boyVoList = new ArrayList<>();

                for (Title boyTitle : titleList) {
                    if (parentTitle.getId() .equals(boyTitle.getParentId())) {
                        BoyVo boyVo = new BoyVo();
                        boyVo.setId(boyTitle.getId());
                        boyVo.setName(boyTitle.getName());
                        boyVoList.add(boyVo);
                    }
                }
                //将子类的数据（ID和Name）赋予给父类的  boyVoList
                titleTestVo.setBoyVoList(boyVoList);
                //将父类对象的数据赋予的父类
                titleTestVoList.add(titleTestVo);
            }
            System.out.println("=============================="+titleTestVoList);
            return titleTestVoList;
        }else {
            return null;
        }

    }
}