package com.aglife.yin.pojo;

import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ALife implements Serializable {
    public ALife(String id, String title, String fromUrl) {
        this.id = id;
        this.title = title;
        this.fromUrl = fromUrl;
    }

    public ALife() {

    }

    @Id
    private String id;
    //标题
    private String title;
    private String content;
    private String videoUrl;
    private String imageUrl;
    private int status;
    private int type;
    private String tag;
    private int opId;
    private int creator;
    private String creatorName;
    private Date createTime;
    private String fromUrl;
    //推荐
    private int recommend;
    //评论
    private int comment;
    //阅读
    private int reader;

    public int getComment() {
        return comment;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }

    public String getFromUrl() {
        return fromUrl;
    }

    public void setFromUrl(String fromUrl) {
        this.fromUrl = fromUrl;
    }


    public Date getCreateTime() {
        return createTime;
    }

    //25 Feb, 2013
    public String getCreateTimeStr() {
        SimpleDateFormat time = new SimpleDateFormat("MM.dd HH:mm");
        return time.format(createTime);
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getCreator() {
        return creator;
    }

    public void setCreator(int creator) {
        this.creator = creator;
    }

    public int getOpId() {
        return opId;
    }

    public void setOpId(int opId) {
        this.opId = opId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRecommend() {
        return recommend;
    }

    public void setRecommend(int recommend) {
        this.recommend = recommend;
    }

    public int getReader() {
        return reader;
    }

    public void setReader(int reader) {
        this.reader = reader;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }
}
