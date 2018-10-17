package com.aglife.yin.pojo;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Comment {
    public  Comment(String parentId,String answerId,String content)
    {
        this.parentId=parentId;
        this.answerId=answerId;
        this.content=content;
        createDate=new Date();
    }
    @Id
    private String id;
    private String parentId;
    private String answerId;
    private Date createDate;
    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getAnswerId() {
        return answerId;
    }

    public void setAnswerId(String answerId) {
        this.answerId = answerId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
