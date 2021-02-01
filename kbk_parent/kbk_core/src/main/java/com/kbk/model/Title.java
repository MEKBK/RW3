package com.kbk.model;

import java.util.Arrays;

public class Title {
    private Long id;

    private Long parentId;

    private String name;

    private String level;

    private Integer status;

    private Long createdTime;

    private Long updatedTime;

    private String updateBy;

    public Title(Long id, Long parentId, String name, String level, Integer status, Long createdTime, Long updatedTime, String updateBy) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.level = level;
        this.status = status;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
        this.updateBy = updateBy;
    }

    public Title() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
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

    public Long getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    @Override
    public String toString() {
        return "Title{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", name='" + name + '\'' +
                ", level='" + level + '\'' +
                ", status=" + status +
                ", createdTime=" + createdTime +
                ", updatedTime=" + updatedTime +
                ", updateBy='" + updateBy + '\'' +
                '}';
    }
}