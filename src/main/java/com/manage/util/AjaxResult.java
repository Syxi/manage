package com.manage.util;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @Author suYan
 * @Date 2022/1/3 2:01
 */

@Component
@Data
public class AjaxResult {
    private boolean success;
    private String message;


    public void ajaxFalse(String message){
        this.message = message;
        this.success = false;
    }

    public void ajaxTrue(String message){
        this.message = message;
        this.success = true;
    }
}
