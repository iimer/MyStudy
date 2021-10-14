import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解
 * @author qgyiimer
 * @create 2021-{05}--11:14
 */
public class Test03 {
    @MyAnnotation2()
    public void test(){}
}

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2{
    //注解的参数：参数类型+参数名（）
    //不写默认值的话使用时必须指定
    String name() default "";
    int age() default 0;
    int id() default -1;
    String[] schools() default {"清华"};
}
