package com.manage.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * icon
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Icon implements Serializable {
    private Integer id;

    private String url;

    private static final long serialVersionUID = 1L;
}