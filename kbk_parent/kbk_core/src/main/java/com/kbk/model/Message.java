package com.kbk.model;

public class Message {
    private Long id;

    private Long workId;

    private String touristName;

    private Integer status;

    private Long roleId;

    private Long createdTime;

    private Long updatedTime;

    private String contents;

    private Long replyId;

    public Message(Long id, Long workId, String touristName, Integer status, Long roleId, Long createdTime, Long updatedTime, String contents, Long replyId) {
        this.id = id;
        this.workId = workId;
        this.touristName = touristName;
        this.status = status;
        this.roleId = roleId;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
        this.contents = contents;
        this.replyId = replyId;
    }

    public Message() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWorkId() {
        return workId;
    }

    public void setWorkId(Long workId) {
        this.workId = workId;
    }

    public String getTouristName() {
        return touristName;
    }

    public void setTouristName(String touristName) {
        this.touristName = touristName == null ? null : touristName.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
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

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents == null ? null : contents.trim();
    }

    public Long getReplyId() {
        return replyId;
    }

    public void setReplyId(Long replyId) {
        this.replyId = replyId;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", workId=" + workId +
                ", touristName='" + touristName + '\'' +
                ", status=" + status +
                ", roleId=" + roleId +
                ", createdTime=" + createdTime +
                ", updatedTime=" + updatedTime +
                ", contents='" + contents + '\'' +
                ", replyId=" + replyId +
                '}';
    }
}