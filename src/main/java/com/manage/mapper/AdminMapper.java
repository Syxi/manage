package com.manage.mapper;

import com.manage.entity.Admin;

import java.util.List;
import java.util.Map;

public interface AdminMapper {

    Admin login(String username, String password);

   List<Admin> queryList(Map<String, Object> paramMap);

   Integer queryCount(Map<String, Object> paramMap);

   int insertAdmin(Admin admin);

   Admin selectById(Integer id);

   Admin selectByName(String username);

   Admin selectByEmail(String email);



   int delByAdminIds(List<Integer> ids);

   int updateByAdmin(Admin admin);



}