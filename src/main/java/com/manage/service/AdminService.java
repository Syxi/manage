package com.manage.service;

import com.manage.entity.Admin;
import com.manage.util.PageBean;

import java.util.List;
import java.util.Map;

/**
 * @Author suYan
 * @Date 2022/1/2 21:30
 */

public interface AdminService {

    Admin login(String username, String password);

    PageBean<Admin> queryPage(Map<String, Object> paramMap);

    int insertAdmin(Admin admin);

    Admin selectById(Integer id);

    int delByAdminIds(List<Integer> ids);

    int editByAdmin(Admin admin);

    Admin selectByName(String username);

    Admin selectByEmail(String email);
}
