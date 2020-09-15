package com.lgodinez.blog;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name="entries")
public class Entries {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String text;
    private Integer authorId;
    private LocalDateTime publishDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public LocalDateTime getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDateTime publishDate) {
        this.publishDate = publishDate;
    }

    public Entries(Integer id, String title, String text, Integer authorId, LocalDateTime publishDate) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.authorId = authorId;
        this.publishDate = publishDate;
    }
}
