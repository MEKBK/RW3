package com.kbk.vo;

public class ReplyVo {

    private Long id;

    private Long replyId;

    private Long roleId;

    private String touristName;

    private String contents;

    private Long createdTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getReplyId() {
        return replyId;
    }

    public void setReplyId(Long replyId) {
        this.replyId = replyId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getTouristName() {
        return touristName;
    }

    public void setTouristName(String touristName) {
        this.touristName = touristName;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public String toString() {
        return "ReplyVo{" +
                "id=" + id +
                ", replyId=" + replyId +
                ", roleId=" + roleId +
                ", touristName='" + touristName + '\'' +
                ", contents='" + contents + '\'' +
                ", createdTime=" + createdTime +
                '}';
    }
}
