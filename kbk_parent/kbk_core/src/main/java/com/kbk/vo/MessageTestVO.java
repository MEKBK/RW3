package com.kbk.vo;

import java.util.List;

public class MessageTestVO {
    private Long id;

    private Long workId;

    private String touristName;

    private String contents;

    private Long createdTime;

    private List<ReplyVo> replyVo;

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

    public List<ReplyVo> getReplyVo() {
        return replyVo;
    }

    public void setReplyVo(List<ReplyVo> replyVo) {
        this.replyVo = replyVo;
    }

    @Override
    public String toString() {
        return "MessageTestVO{" +
                "id=" + id +
                ", workId=" + workId +
                ", touristName='" + touristName + '\'' +
                ", contents='" + contents + '\'' +
                ", createdTime=" + createdTime +
                ", replyVo=" + replyVo +
                '}';
    }
}
