package 第二个包;

import org.junit.Test;

import java.beans.PropertyVetoException;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author qgyiimer
 * @create 2021-{05}--20:36
 */
public class Client {
    /**
     * 获取属性
     */
    @Test
    public void test1() throws NoSuchFieldException {
        Class clazz = Person.class;

        //获取属性结构
        //getFields()获取所有public修饰的属性，含有父类的,与static等无关，先自己后父亲
        Field[] fields = clazz.getFields();
        for (Field f:
             fields) {
            System.out.println(f);
        }
        System.out.println("*********");
        //getDeclaredFields(),得到所有此类的属性，无关权限，但不会有父类的
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field f:
             declaredFields) {
            System.out.println(f);
        }
//        Field id = clazz.getDeclaredField("id");
//        System.out.println(id);
    }

    /**
     * 获取属性的权限修饰符、数据类型、变量名
     */
    @Test
    public void test2() {
        Class clazz = Person.class;
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field f:
                declaredFields) {
            //获取权限修饰符,得到的0,1,2,4，默认，public，private，protected
            // static则加8,也算是权限修饰符，如public static为9
            int modifiers = f.getModifiers();
            System.out.println(modifiers);
            System.out.println(Modifier.toString(modifiers));

            //获取数据类型
            Class<?> type = f.getType();
            System.out.println(type);

            //变量名
            String name = f.getName();
            System.out.println(name);
        }
    }

    /**
     * 获取方法
     *
     */
    @Test
    public void test3() {
        Class clazz = Person.class;

        //获取所有此Class实例的public修饰的方法，含父，与上面一样
        Method[] methods = clazz.getMethods();
        for (Method m:
             methods) {
            System.out.println(m);
        }
        System.out.println("*********");
        //获取所有此Class的方法，不看权限修饰符，与上面一样
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method m :
                declaredMethods) {
            System.out.println(m);
        }
    }
    /**
     * 获取方法的权限修饰符、返回值类型、方法名、参数、异常、注解
     */
    @Test
    public void test4() {
        Class clazz = Person.class;


        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method m :
                declaredMethods) {
            //获取方法声明的注解,只有RUNTIME能得到
            Annotation[] annotations = m.getAnnotations();
            for (Annotation a :
                    annotations) {
                System.out.println(a);
            }
            //获取方法的权限修饰符
            int modifiers = m.getModifiers();
            System.out.println(Modifier.toString(modifiers));

            //获取方法的返回值类型
            Class<?> returnType = m.getReturnType();
            System.out.println(returnType);

            //获取方法名
            String name = m.getName();

            //获取方法的形参列表
            Class<?>[] parameterTypes = m.getParameterTypes();
            if (parameterTypes.length != 0) {
                for (Class c :
                        parameterTypes) {
                    System.out.println(c.getName());
                }
            }

            //获取方法的异常
            Class<?>[] exceptionTypes = m.getExceptionTypes();
            if (exceptionTypes.length != 0) {
                for (Class c :
                        exceptionTypes) {
                    System.out.println(c.getName());
                }
            }
        }
    }

    /**
     * 获取构造器
     */

    @Test
    public void test5() {
        Class clazz = Person.class;
        //getConStructors()获取所有public的，但没有父类的
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor c :
                constructors) {
            System.out.println(c);

        }
        System.out.println("******");
        //获取所有构造器
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor c :
                declaredConstructors) {
            System.out.println(c);
        }
    }

    /**
     * 获取运行时类的父类
     *
     */
    @Test
    public void test6() {
        Class clazz = Person.class;
        Class superclass = clazz.getSuperclass();
        System.out.println(superclass);
    }

    /**
     * 获取带泛型的父类
     */
    @Test
    public void test7() {
        Class clazz = Person.class;
        //Type也是属于Class的一种
        Type genericSuperclass = clazz.getGenericSuperclass();
        System.out.println(genericSuperclass);
        //获取泛型的类型
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        //数组之间强转的问题？？？
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        System.out.println(((Class)actualTypeArguments[0]).getTypeName());

    }
    /**
     * 获取运行时类实现的接口、包、注解
     */
    @Test
    public void test8() {
        Class clazz = Person.class;

        Class[] interfaces = clazz.getInterfaces();
        for (Class c :
                interfaces) {
            System.out.println(c.getName());
        }

        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation a :
                annotations) {
            System.out.println(a);
        }

        Package aPackage = clazz.getPackage();
        System.out.println(aPackage);
    }

}
