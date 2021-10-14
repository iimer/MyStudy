package com.qgy.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.qgy.mybatisplus.enums.StatusEnum;
import lombok.Data;
import lombok.ToString;

/**
 * @author qgyiimer
 * @create 2021-{06}--11:04
 */
@Data
@ToString
@TableName("users")
public class User {
    //默认为NONE 雪花算法实现随机数，需要Long类型接收
    //type 为Input时，如果没有手动赋值则传入null，数据库根据上一个数据自增
    //type 为auto时，即使手动赋值了也无效，数据库数据为自增显示
    //type 为ASSIGN_ID_时，雪花算法
    //type 为ASSIGN_UUID 主键数据类型必须是String，自动生成UUID进行赋值
    @TableId(type= IdType.INPUT)
    private Integer id;

    @TableField("username")
    private String name;
    //设置不查询这个字段
    @TableField(value = "password",select = false)
    private String pwd;

    //不是数据库中的字段
    @TableField(exist = false)
    private String gender;

    //填充，可以理解为回调
    //配合handler使用
//    @TableField(fill = FieldFill.INSERT)
//    private String insertTime;
//    @TableField(fill = FieldFill.INSERT_UPDATE)
//    private String updateTime;

    //version来实现乐观锁，数据库需要加入一个version字段，默认1
    //需要返回一个OptimisticLockerInterceptor类的bean
//    @Version
//    private Integer version;

    //通过枚举类注解，将数据库字段映射成实体类的枚举类型成变量
    //需要在yml中配置出enums的扫描包
    private StatusEnum status;

    //逻辑删除，数据库中需要加入此字段
    //还需要在yml中配置出删除时的值与没删除时的值
    //执行delete语句时变为update操作
    @TableLogic
    private Integer deleted;
}
