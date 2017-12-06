package com.test.demo.domain.entity;

import java.util.Date;

/**
 * Created by Ryan Miao on 12/2/17.
 */
public class RoomTable {
    private Integer id;
    private String name;
    private String comment;
    private Date createDate;
    private Date updateDate;

    public RoomTable() {
    }

    public RoomTable(String name, String comment, Date createDate, Date updateDate) {
        this.name = name;
        this.comment = comment;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public RoomTable(Integer id, String name, String comment, Date createDate, Date updateDate) {
        this.id = id;
        this.name = name;
        this.comment = comment;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "RoomTable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", comment='" + comment + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                '}';
    }
}