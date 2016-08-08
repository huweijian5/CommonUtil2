package com.gosuncn.cu.db.entity;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;

@Entity(nameInDb = "tb_user")
public class User {

    @Id(autoincrement = true)
    private Long id;
    @NotNull
    private String name;
    private Integer age;
    private Boolean isMan;
    private java.util.Date birthday;

    public User() {
    }

    public User(Long id) {
        this.id = id;
    }
    @Generated(hash = 1206143140)
    public User(Long id, @NotNull String name, Integer age, Boolean isMan, java.util.Date birthday) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.isMan = isMan;
        this.birthday = birthday;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getIsMan() {
        return isMan;
    }

    public void setIsMan(Boolean isMan) {
        this.isMan = isMan;
    }

    public java.util.Date getBirthday() {
        return birthday;
    }

    public void setBirthday(java.util.Date birthday) {
        this.birthday = birthday;
    }

}
