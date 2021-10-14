package qgy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import qgy.beans.User;

/**
 * @author qgyiimer
 * @create 2021-{05}--20:13
 */


public class SecondJavaConfig {
    //函数和别的组件同名的话会覆盖掉组件
    @Bean
    public User user5() {
        System.out.println("我不需要写配置类注解");
        return new User();
    }
}
