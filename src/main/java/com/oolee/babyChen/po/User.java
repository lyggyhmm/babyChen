package com.oolee.babyChen.po;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 用户实体类
 */
@Getter
@Setter
@ToString
public class User implements Serializable {

    private Integer id;

    //绑定账号
    private String code;

    //密码
    private String password;

    //关联账号
    private String associateCode;


}
