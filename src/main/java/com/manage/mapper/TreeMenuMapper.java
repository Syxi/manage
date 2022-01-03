package com.manage.mapper;

import com.manage.entity.TreeMenu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TreeMenuMapper {

    List<TreeMenu> selectByAdminId(Integer id);

    List<TreeMenu> selectAll();

    TreeMenu selectById(Integer id);

    TreeMenu selectByName(String name);

    TreeMenu selectByUrl(String url);

    int editByPermission(TreeMenu treeMenu);

    int insertPermission(TreeMenu treeMenu);

    int delByPermissionIds(List<Integer> ids);

    void delRolePermission(List<Integer> ids);

    List<TreeMenu> selectByPid(Integer id);

    List<TreeMenu> selectByRoleId(Integer id);

    int updateRolePermission(@Param("ids") List<Integer> ids, @Param("id") Integer id);

    void delRolePermissionByRid(Integer id);
}