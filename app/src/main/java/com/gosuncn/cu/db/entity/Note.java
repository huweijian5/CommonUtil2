package com.gosuncn.cu.db.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Transient;

@Entity
public class Note {
    @Id(autoincrement = true)
    private Long id;
    @NotNull
    private String name;
    @Property(nameInDb = "content")
    private String content;

    @Transient//临时用，此字段不会持久化到数据库
    private int tempUsageCount;

    public Note() {
    }

    public Note(Long id) {
        this.id = id;
    }

    @Generated(hash = 1329258129)
    public Note(Long id, @NotNull String name, String content) {
        this.id = id;
        this.name = name;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getName() {
        return name;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
