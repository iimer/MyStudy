package com.qgy.mybatisplus;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
/*
    查询语句：
    selectList():
        null:所有
        wrapper:QueryWrapper实现类
            函数：eq(name,value) -> =
                 allEq(map) -> = & =
参数类型与上       lt(name,value) -> <
一个一样就省略     gt -> >
                 ne -> <>
                 ge -> >=
                 le -> <=
                 like -> %value%
                 likeLeft -> %value
                 likeRight -> value%
                 inSQL -> where (id in (sql))
                 orderByAsc(name) -> 升序
                 orderByDesc(name) ->降序
                 having(id > 8)
    selectById:通过id查询
    selectBatchIds:拿到多个id对应的值
    selectByMap:进行等值判断，逻辑判断还是要用wrapper
    selectMaps(wrapper):返回到的结果封装为map类型
    selectList(wrapper):返回成list集合
    selectCount(wrapper)
    分页查询：//需要实现接口并加载到IOC
    1、
        Page<User> page = new Page<>（current,size）
        Page<User> result = mapper.selectPage(page,null)
        sout(result.getSize())
        sout(result.getTotal())
        result.getRecords().forEach(soutc)

    2、
        Page<Map<String,Object>> page = new Page<>（current,size）
        selectMapsPage(page,null).getRecords.forEach(soutc)
    selectObjs(wrapper) 只拿主键
    selectOne(wrapper) 必须要保证只有一条记录，否则抛异常

 */

@SpringBootTest
class MybatisPlusApplicationTests {

    @Test
    void contextLoads() {

    }

}
