package com.manage.service.impl;

import com.manage.entity.Icon;
import com.manage.mapper.IconMapper;
import com.manage.service.IconService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author suYan
 * @Date 2022/1/2 22:13
 */

@Service
public class IconServiceImpl implements IconService {

    @Autowired
    private IconMapper iconMapper;

    @Override
    public List<Icon> selectAll() {
        return iconMapper.selectAll();
    }
}
