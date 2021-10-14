package com.qgy.mybatisplus.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;

/**
 * 注解方式完成映射
 * @author qgyiimer
 * @create 2021-{06}--12:28
 */
public enum StatusEnum {
    WORK(1,"上班"),
    REST(1,"上班");

    StatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @EnumValue
    private Integer code;
    private String msg;
}
