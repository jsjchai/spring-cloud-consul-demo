package com.github.jsjchai.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @author jsjchai
 */
@Getter
@Setter
@ToString
public class User {

    private Long id;

    private String name;

    private Integer age;

    private Date createTime;

    private Date updateTime;
}
