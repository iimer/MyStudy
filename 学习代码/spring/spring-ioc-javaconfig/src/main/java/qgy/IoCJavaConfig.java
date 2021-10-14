package qgy;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.*;
import qgy.beans.MyImportBeanDefinitionRegister;
import qgy.beans.MyImportSelector;
import qgy.beans.Role;
import qgy.beans.User;

/**
 * 用于标记一个spring配置类，之前是根据xml启动spring上下文
 * 相当于xml文件<beans></beans>
 * @author qgyiimer
 * @create 2021-{05}--19:48
 */
//任何一个注解的value都可以省略


/*
1.导入其他配置类@Import(SecondJavaConfig.class)
2.导入类注册为Bean @Import(Role.class)
3.导入ImportSelector实现类，可以注册多个bean 只能通过类型来得到
4.导入实现ImportBeanDefinitionRegister,可以注册多个BeanDefinition
 */
//@Import({SecondJavaConfig.class})
//@Import(Role.class)只能用类型
//@Import(MyImportSelector.class) 只能用类型
//@Import(MyImportBeanDefinitionRegister.class) 可以用名字

@Configuration
@ComponentScan(basePackages = "qgy")
@PropertySource({"db.properties"})
@Import(MyImportBeanDefinitionRegister.class)
public class IoCJavaConfig {

    /**
     * 可以干预Bean实例化过程
     * 将一个类的实例，注册为一个Bean
     * 会自动将返回值作为Bean的类型  将方法名作为bean的id
     * name属性设置id，非别名，但可以是数组
     * @return
     *
     * 怎么去依赖外部Bean？当做方法的参数就行，会自动注入，不需要写Autowired
     * 依赖内部Bean呢？直接调用方法即可
     */
    @Bean(initMethod = "",destroyMethod = "")
    public DruidDataSource dataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setName("root");
        druidDataSource.setPassword("123456");
        return druidDataSource;
    }
}
