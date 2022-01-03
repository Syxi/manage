package com.manage.interceptor;

import com.manage.util.Const;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author suYan
 * @Date 2022/1/3 10:11
 */

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String contextPath = request.getRequestURI();
        if(!StringUtils.isEmpty(request.getSession().getAttribute(Const.ADMIN))){
            return true;
        }
        response.sendRedirect(request.getContextPath() + "/manager/login");
        return false;
    }
}
