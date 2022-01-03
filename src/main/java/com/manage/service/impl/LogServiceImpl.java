package com.manage.service.impl;

import com.manage.entity.Log;
import com.manage.mapper.LogMapper;
import com.manage.service.LogService;
import com.manage.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author suYan
 * @Date 2022/1/2 22:14
 */

@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private LogMapper logMapper;

    @Override
    public void insertByLog(Log log) {

    }

    @Override
    public PageBean<Log> queryPage(Map<String, Object> paramMap) {
        PageBean<Log> pageBean = new PageBean<>((Integer) paramMap.get("pageNum"),(Integer) paramMap.get("pageSize"));

        Integer startIndex = pageBean.getStartIndex();
        paramMap.put("startIndex",startIndex);
        List<Log> datas = logMapper.queryList(paramMap);
        pageBean.setDatas(datas);

        Integer totalSize = logMapper.queryCount(paramMap);
        pageBean.setTotalSize(totalSize);
        return pageBean;
    }

    @Override
    public int delByLogIds(List<Integer> ids) {
        return logMapper.deleteByIds(ids);
    }
}
