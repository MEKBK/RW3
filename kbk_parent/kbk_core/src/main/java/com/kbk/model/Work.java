package com.kbk.model;

public class Work {
    private Long id;

    private String name;

    private Integer status;

    private Long fristId;

    private Long secondId;

    private String introduction;

    private String thumbnail;

    private String url;

    private String content;

    private String picture;

    private Long createdTime;

    private Long updatedTime;

    private String updatedBy;

    public Work(Long id, String name, Integer status, Long fristId, Long secondId, String introduction, String thumbnail, String url, String content, String picture, Long createdTime, Long updatedTime, String updatedBy) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.fristId = fristId;
        this.secondId = secondId;
        this.introduction = introduction;
        this.thumbnail = thumbnail;
        this.url = url;
        this.content = content;
        this.picture = picture;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
        this.updatedBy = updatedBy;
    }

    public Work() {
        super();
    }

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
        this.name = name == null ? null : name.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getFristId() {
        return fristId;
    }

    public void setFristId(Long fristId) {
        this.fristId = fristId;
    }

    public Long getSecondId() {
        return secondId;
    }

    public void setSecondId(Long secondId) {
        this.secondId = secondId;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail == null ? null : thumbnail.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public Long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    public Long getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    @Override
    public String toString() {
        return "Work{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", fristId=" + fristId +
                ", secondId=" + secondId +
                ", introduction='" + introduction + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", url='" + url + '\'' +
                ", content='" + content + '\'' +
                ", picture='" + picture + '\'' +
                ", createdTime=" + createdTime +
                ", updatedTime=" + updatedTime +
                ", updatedBy='" + updatedBy + '\'' +
                '}';
    }
}