package com.lms.springboot.entity;

import javax.persistence.*;
@Entity
@Table(name="tbl_role_menu")
public class RoleMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="roleId")
    private Role role;
    @ManyToOne
    @JoinColumn(name="menuId")
    private Role menu;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Role getMenu() {
        return menu;
    }

    public void setMenu(Role menu) {
        this.menu = menu;
    }
}
