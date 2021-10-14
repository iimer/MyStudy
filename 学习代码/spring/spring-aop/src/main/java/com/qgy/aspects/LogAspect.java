package com.qgy.aspects;

import jdk.nashorn.internal.runtime.logging.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * excution()
 * 访问权限修饰符：可不写 可以匹配任何一个访问修饰符
 * 空格连接 返回值：如果是jdk自带不用谢完整限定名，如果是自定义类型需要写完整限定名，*代表所有方法值都能匹配
 * 空格连接 包名：com.*只会匹配下一级，com..*会把下面的所有级匹配
 * .连接类名，*表示任何类名，若要模糊匹配*ServiceImpl代表半确定半任意
 * .连接方法名：*代表任意方法，同样可以模糊匹配
 * (连接参数：如果是jdk自带不用谢完整限定名，如果是自定义类型需要写完整限定名
 * 如果需要匹配任意参数，用..而不是*，因为可能不止一个参数
 * @author qgyiimer
 * @create 2021-{05}--10:42
 */

@Component //标记为Bean组件，才能切入到ioc的bean
@Aspect //标记为切面
public class LogAspect {

//    @Pointcut("execution(* com.qgy.service.impl.*.*(..))")
//    public void aa() {
//
//    }
    /**
     * 参数不能随便写，要么returning要么throwing
     * 类型由参数类型决定，注解中只需要写参数名表面它是注解
     *
     * 对于0 formal unbound in pointcut报错：
     *      1.joinPoint可能没写在第一位   -->否则，spring将对应不到那个函数，用了方法就会报错
     *      2.execution里面的值写的不对   -->切面找不到切点，上面根本的原因也是这个
     * @param
     */

    //前置通知
    @Before("execution(* com.qgy.service.impl.*.*(..)) && @annotation(logger)")
    public void before(JoinPoint joinPoint, Logger logger) {
        //获取方法名
        String name = joinPoint.getSignature().getName();

        //所有的参数
        Object[] args = joinPoint.getArgs();

        System.out.println("前置通知,参数是："+ Arrays.asList(args)+logger.name());
    }

//    //后置通知
    @After("execution(* com.qgy.service.impl.*.*(..)) && @annotation(logger)")
    public void after(JoinPoint joinPoint,Logger logger) {
        //获取方法名
        String name = joinPoint.getSignature().getName();

        //所有的参数
        Object[] args = joinPoint.getArgs();

        System.out.println("后置通知,参数是："+ Arrays.asList(args) +logger.name());

    }
    //后置异常通知
    @AfterThrowing(value = "execution(* com.qgy.service.impl.*.*(..))")
    public void afterThrowing() {
        System.out.println("后置异常通知");
    }
    //后置返回通知
    @AfterReturning("execution(* com.qgy.service.impl.*.*(..))")
    public void afterReturning() {
        System.out.println("后置返回通知");
    }
//    环绕

    /**
     * 环绕，自定义，下面的不准确，只需要关注proceed()即spring规范的执行顺序就行，其他的都是基于这个而灵活的
     * 前置-函数-后置返回（后置异常）-后置
     * 返回和异常只存在一个，可以理解为有了异常就没有返回了，也确实如此，spring底层应该也是采用的throws，因为后面的通知还是照样执行，但是自己的代码就不好执行了
     * 可以理解为spring catch到了这个异常，然后执行后面的函数，再抛出来，即对应原方法的意思（原方法必定是抛出去的！）。
     * @param joinPoint
     */
    @Around("execution(* com.qgy.service.impl.*.*(..))")
    public void around(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("前置环绕");
            joinPoint.proceed();//相当于对上面的通知+函数调用
                                //所以说这个函数就是加强了一些功能，增加了扩展性
            System.out.println("后置环绕");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("异常环绕");
        }
        System.out.println("返回环绕");
    }

    /**
     * 将被代理的方法成为方法体
     * 用try catch来形容生命周期
     * try里面：前置通知-方法体-后置通知
     * catch里面：异常-后置异常通知
     * 没异常：后置返回通知（要么后置异常要么后置返回）
     *
     */
}
