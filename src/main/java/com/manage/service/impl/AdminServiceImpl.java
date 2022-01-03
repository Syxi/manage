package com.manage.service.impl;

import com.manage.entity.Admin;
import com.manage.mapper.AdminMapper;
import com.manage.service.AdminService;
import com.manage.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author suYan
 * @Date 2022/1/2 21:53
 */

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin login(String username, String password) {
        return adminMapper.login(username, password);
    }

    @Override
    public PageBean<Admin> queryPage(Map<String, Object> paramMap) {
        PageBean<Admin> pageBean = new PageBean<>((Integer)paramMap.get("pageNum"),(Integer) paramMap.get("pageSize"));

        Integer startIndex = pageBean.getStartIndex();
        paramMap.put("startIndex",startIndex);
        List<Admin> datas = adminMapper.queryList(paramMap);
        pageBean.setDatas(datas);

        Integer totalSize = adminMapper.queryCount(paramMap);
        pageBean.setTotalSize(totalSize);
        return pageBean;
    }

    @Override
    public int insertAdmin(Admin admin) {
        return adminMapper.insertAdmin(admin);
    }

    @Override
    public Admin selectById(Integer id) {
        return adminMapper.selectById(id);
    }

    @Override
    public int delByAdminIds(List<Integer> ids) {
        return adminMapper.delByAdminIds(ids);
    }

    @Override
    public int editByAdmin(Admin admin) {
        return adminMapper.updateByAdmin(admin);
    }

    @Override
    public Admin selectByName(String username) {
        return adminMapper.selectByName(username);
    }

    @Override
    public Admin selectByEmail(String email) {
        return adminMapper.selectByEmail(email);
    }
}
