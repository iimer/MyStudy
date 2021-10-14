import java.lang.annotation.*;

/**
 * 测试元注解
 * @author qgyiimer
 * @create 2021-{05}--11:07
 */
public class Test02 {

}

//定义一个注解
//Target 表示在哪上面可以加这个注解
//TYPE是类上
@Target(value = {ElementType.METHOD,ElementType.TYPE})
//表示我们的注解在什么地方还有效
//runtime > class >sources
@Retention(value = RetentionPolicy.RUNTIME)
//表示是否将我们的注解生成在JAVAdoc中
@Documented

//表示子类可以继承父类中的该注解
@Inherited
@interface MyAnnotation{

}
