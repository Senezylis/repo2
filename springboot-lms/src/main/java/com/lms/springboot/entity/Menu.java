package com.lms.springboot.entity;

import javax.persistence.*;

@Entity
@Table(name="tbl_menu")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 10)
    private String divId;  //菜单id

    @Column(length = 100)
    private String icon;

    @Column(length = 50)
    private String name;

    @Column(length = 10)
    private Integer orderNo;

    @Column(length = 10)
    private Integer pId;    //父菜单Id 根是-1 然后自己编id

    @Column(length = 100)
    private String permissions;  //权限

    @Column(length = 10)
    private Integer state;  //菜单节点类型  0根节点close  1叶子节点opend

    @Column(length = 10)
    private Integer type;

    @Column(length = 200)
    private String url;    //菜单地址

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDivId() {
        return divId;
    }

    public void setDivId(String divId) {
        this.divId = divId;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
