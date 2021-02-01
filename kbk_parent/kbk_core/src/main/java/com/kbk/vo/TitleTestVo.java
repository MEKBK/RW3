package com.kbk.vo;

import java.util.List;

public class TitleTestVo {
    private Long id;
    private String name;
    private List<BoyVo> boyVoList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BoyVo> getBoyVoList() {
        return boyVoList;
    }

    public void setBoyVoList(List<BoyVo> boyVoList) {
        this.boyVoList = boyVoList;
    }

    @Override
    public String toString() {
        return "TitleTestVo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", boyVoList=" + boyVoList +
                '}';
    }


}
