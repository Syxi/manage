package com.manage.service.impl;

import com.manage.entity.Role;
import com.manage.mapper.RoleMapper;
import com.manage.service.RoleService;
import com.manage.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @Author suYan
 * @Date 2022/1/2 22:18
 */

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> selectAll() {
        return roleMapper.selectAll();
    }

    @Override
    public PageBean<Role> queryPage(Map<String, Object> paramMap) {
        PageBean<Role> pageBean = new PageBean<>((Integer) paramMap.get("pageNum"),(Integer) paramMap.get("pageSize"));

        Integer startIndex = pageBean.getStartIndex();
        paramMap.put("startIndex",startIndex);
        List<Role> datas = roleMapper.queryList(paramMap);
        pageBean.setDatas(datas);

        Integer totalSize = roleMapper.queryCount(paramMap);
        pageBean.setTotalSize(totalSize);
        return pageBean;
    }

    @Override
    @Transactional
    public int delByRoleIds(List<Integer> ids) {
        try {
            return roleMapper.delByRoleIds(ids);
        } catch (Exception e) {
            //存在管理员拥有此角色，无法删除
            return 0;
        }
    }

    @Override
    public Role selectById(Integer id) {
        return roleMapper.selectById(id);
    }

    @Override
    public Role selectByName(String name) {
        return roleMapper.selectByName(name);
    }

    @Override
    public int editByRole(Role role) {
        return roleMapper.editByRole(role);
    }

    @Override
    public int insertRole(Role role) {
        return roleMapper.insertRole(role);
    }
}
