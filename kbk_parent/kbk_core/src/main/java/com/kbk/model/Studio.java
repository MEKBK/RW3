package com.kbk.model;

public class Studio {
    private Long id;

    private String name;

    private byte[] status;

    private String picture;

    private String about;

    private Long createdTime;

    private Long updatedTime;

    private String updatedBy;

    public Studio(Long id, String name, byte[] status, String picture, String about, Long createdTime, Long updatedTime, String updatedBy) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.picture = picture;
        this.about = about;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
        this.updatedBy = updatedBy;
    }

    public Studio() {
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

    public byte[] getStatus() {
        return status;
    }

    public void setStatus(byte[] status) {
        this.status = status;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about == null ? null : about.trim();
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
}