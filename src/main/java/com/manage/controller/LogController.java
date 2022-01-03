package com.manage.controller;

import com.manage.entity.Log;
import com.manage.service.LogService;
import com.manage.util.AjaxResult;
import com.manage.util.Data;
import com.manage.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author suYan
 * @Date 2022/1/3 10:26
 */

@Controller
@RequestMapping("/manager")
public class LogController {

    @Autowired
    private AjaxResult ajaxResult;
    @Autowired
    private LogService logService;

    /**
     * 日志页面
     * @return
     */
    @GetMapping("/log")
    public String log(){
        return "manager/log/logList";
    }


    /**
     * 异步加载日志列表
     * @param pageNum
     * @param pageSize
     * @param username
     * @param logTime
     * @return
     */
    @RequestMapping("/logList")
    @ResponseBody
    public Object adminList(@RequestParam(value = "page", defaultValue = "1") Integer pageNum,
                            @RequestParam(value = "limit", defaultValue = "20") Integer pageSize,
                            String username,String logTime){
        Map<String,Object> paramMap = new HashMap();
        paramMap.put("pageNum",pageNum);
        paramMap.put("pageSize",pageSize);

        //判断是否为空
        if(!StringUtils.isEmpty(username)) paramMap.put("username",username);
        if(!StringUtils.isEmpty(logTime)){
            String[] split = logTime.split(" - ");
            paramMap.put("stime",split[0]);
            paramMap.put("ftime",split[1]);
        }

        PageBean<Log> pageBean = logService.queryPage(paramMap);

        Map<String,Object> rest = new HashMap();
        rest.put("code", 0);
        rest.put("msg", "");
        rest.put("count",pageBean.getTotalSize());
        rest.put("data", pageBean.getDatas());
        return rest;
    }


    @PostMapping("/delLog")
    @ResponseBody
    public AjaxResult delLog(Data data){
        int count = logService.delByLogIds(data.getIds());
        if(count >= data.getIds().size()){
            ajaxResult.ajaxTrue("删除成功");
        }else{
            ajaxResult.ajaxFalse("删除失败");
        }
        return ajaxResult;
    }
}
