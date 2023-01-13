//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.mjc.school.repository.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class NewsModel {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createDate;
    private LocalDateTime lastUpdatedDate;
    private Long authorId;

    public NewsModel(Long id, String title, String content, LocalDateTime createDate, LocalDateTime lastUpdatedDate, Long authorId) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createDate = createDate;
        this.lastUpdatedDate = lastUpdatedDate;
        this.authorId = authorId;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }

    public void setLastUpdatedDate(LocalDateTime lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public Long getAuthorId() {
        return this.authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof NewsModel)) {
            return false;
        } else {
            NewsModel newsModel = (NewsModel)o;
            return Objects.equals(this.id, newsModel.id) && Objects.equals(this.title, newsModel.title) && Objects.equals(this.content, newsModel.content) && Objects.equals(this.createDate, newsModel.createDate) && Objects.equals(this.lastUpdatedDate, newsModel.lastUpdatedDate) && Objects.equals(this.authorId, newsModel.authorId);
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, this.title, this.content, this.createDate, this.lastUpdatedDate, this.authorId});
    }
}
