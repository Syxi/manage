package com.manage.service;

import com.manage.entity.Role;
import com.manage.util.PageBean;

import java.util.List;
import java.util.Map;

/**
 * @Author suYan
 * @Date 2022/1/2 21:32
 */

public interface RoleService {

    List<Role> selectAll();

    PageBean<Role> queryPage(Map<String, Object> paramMap);

    int delByRoleIds(List<Integer> ids);

    Role selectById(Integer id);

    Role selectByName(String name);

    int editByRole(Role role);

    int insertRole(Role role);
}
