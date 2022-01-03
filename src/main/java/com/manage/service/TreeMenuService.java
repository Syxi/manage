package com.manage.service;

import com.manage.entity.TreeMenu;

import java.util.List;

/**
 * @Author suYan
 * @Date 2022/1/2 22:41
 */

public interface TreeMenuService {
    List<TreeMenu> selectByAdminId(Integer id);

    List<TreeMenu> selectAll();

    TreeMenu selectById(Integer id);

    TreeMenu selectByName(String name);

    TreeMenu selectByUrl(String url);

    int editByPermission(TreeMenu treeMenu);

    int insertPermission(TreeMenu treeMenu);

    int delByPermissionIds(List<Integer> ids);

    List<TreeMenu> selectByPid(Integer id);

    List<TreeMenu> selectByRoleId(Integer id);

    int updateRolePermission(List<Integer> ids, Integer id);
}
