package com.kbk.model;

public class Role {
    private Long id;

    private String roleName;

    private byte[] banner;

    private byte[] message;

    private byte[] studio;

    private byte[] work;

    private Long createdTime;

    private Long updatedTime;

    private String createdBy;

    public Role(Long id, String roleName, byte[] banner, byte[] message, byte[] studio, byte[] work, Long createdTime, Long updatedTime, String createdBy) {
        this.id = id;
        this.roleName = roleName;
        this.banner = banner;
        this.message = message;
        this.studio = studio;
        this.work = work;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
        this.createdBy = createdBy;
    }

    public Role() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public byte[] getBanner() {
        return banner;
    }

    public void setBanner(byte[] banner) {
        this.banner = banner;
    }

    public byte[] getMessage() {
        return message;
    }

    public void setMessage(byte[] message) {
        this.message = message;
    }

    public byte[] getStudio() {
        return studio;
    }

    public void setStudio(byte[] studio) {
        this.studio = studio;
    }

    public byte[] getWork() {
        return work;
    }

    public void setWork(byte[] work) {
        this.work = work;
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

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }
}