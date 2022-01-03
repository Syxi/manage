package com.manage.mapper;

import com.manage.entity.Log;

import java.util.List;
import java.util.Map;

public interface LogMapper {

    void insertByLog(Log log);

    List<Log> queryList(Map<String, Object> paramMap);

    Integer queryCount(Map<String, Object> paramMap);

    int deleteByIds(List<Integer> ids);
}