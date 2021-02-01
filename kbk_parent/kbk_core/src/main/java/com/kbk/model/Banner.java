package com.kbk.model;

public class Banner {
    private Long id;

    private String cover;

    private String url;

    private Integer status;

    private Long createdTime;

    private Long updateTime;

    private String updateBy;

    public Banner(Long id, String cover, String url, Integer status, Long createdTime, Long updateTime, String updateBy) {
        this.id = id;
        this.cover = cover;
        this.url = url;
        this.status = status;
        this.createdTime = createdTime;
        this.updateTime = updateTime;
        this.updateBy = updateBy;
    }

    public Banner() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    @Override
    public String toString() {
        return "Banner{" +
                "id=" + id +
                ", cover='" + cover + '\'' +
                ", url='" + url + '\'' +
                ", status=" + status +
                ", createdTime=" + createdTime +
                ", updateTime=" + updateTime +
                ", updateBy='" + updateBy + '\'' +
                '}';
    }
}