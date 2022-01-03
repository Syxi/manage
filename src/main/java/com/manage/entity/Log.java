package com.manage.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * log
 * @author 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Log implements Serializable {
    private Integer id;

    private String username;

     // 日志的uri路径
    private String uri;

    // 生成日志的时间
    private String logTime;

    private static final long serialVersionUID = 1L;
}