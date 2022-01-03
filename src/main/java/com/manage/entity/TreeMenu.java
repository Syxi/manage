package com.manage.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * treemenu 菜单树
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TreeMenu implements Serializable {
    private Integer id;

    private Integer pid;

    private String name;

    private String icon;

    private String url;

    private Boolean checked = false;

    private List<TreeMenu> children = new ArrayList<>();

    private static final long serialVersionUID = 1L;
}