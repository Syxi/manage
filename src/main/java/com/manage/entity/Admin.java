package com.manage.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * admin
 * @author 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin implements Serializable {
    private Integer id;

    private String username;

    private String password;

    private String phone;

    private String email;

    private Integer rid;

    // 0为待审核，1为通过审核
    private Integer status;

    private String createTime;

    // 添加角色
    private String roleName;

    private static final long serialVersionUID = 1L;
}