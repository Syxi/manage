package com.manage.service;

import com.manage.entity.Log;
import com.manage.util.PageBean;

import java.util.List;
import java.util.Map;

/**
 * @Author suYan
 * @Date 2022/1/2 21:31
 */

public interface LogService {

    void insertByLog(Log log);

    PageBean<Log> queryPage(Map<String, Object> paramMap);

    int delByLogIds(List<Integer> ids);
}
