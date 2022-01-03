package com.manage.mapper;

import com.manage.entity.Role;

import java.util.List;
import java.util.Map;

public interface RoleMapper {

    List<Role> selectAll();

    List<Role> queryList(Map<String, Object> paramMap);

    Integer queryCount(Map<String, Object> paramMap);

    int delByRoleIds(List<Integer> ids);

    Role selectById(Integer id);

    Role selectByName(String name);

    int editByRole(Role role);

    int insertRole(Role role);

}