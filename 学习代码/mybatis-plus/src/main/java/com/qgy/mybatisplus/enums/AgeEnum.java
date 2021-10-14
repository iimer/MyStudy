package com.qgy.mybatisplus.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;
import lombok.Data;

/**
 * 接口方式完成映射
 * @author qgyiimer
 * @create 2021-{06}--12:35
 */

public enum AgeEnum implements IEnum<Integer> {
    ONE(1,"一岁"),
    TWO(2,"两岁");


    AgeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private Integer code;
    private String msg;

    @Override
    public Integer getValue() {
        return this.code;
    }
}
