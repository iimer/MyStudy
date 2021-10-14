import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author qgyiimer
 * @create 2021-{05}--21:45
 */
public class test {

    /**
     * 调用特定属性
     * @throws Exception
     */
    @Test
    public void testField1() throws Exception{
        Class clazz = Person.class;

        //获取对象
        Person o = (Person) clazz.newInstance();

        //获取类的指定属性:要求是public 的属性，不然都拿不到(不常用)
        Field id = clazz.getField("id");
        //调用set方法设置指定对象的属性值
        id.set(o,10);
        //得到指定对象的
        Object o1 = id.get(o);
        System.out.println(o1);


    }

    /**
     * 调用特定属性
     * @throws Exception
     */
    @Test
    public void testField2() throws Exception{
        Class clazz = Person.class;

        //获取对象
        Person o = (Person) clazz.newInstance();

        //获取类的指定属性:能拿到但是想操作非public的必须使用setAccessible
        Field id = clazz.getDeclaredField("name");
        System.out.println(id.getName());
        //使用setAccessible
        id.setAccessible(true);
        id.set(o,"123");
        //得到指定对象的
        Object o1 = id.get(o);
        System.out.println(o1);
    }

    /**
     * 调用特定方法
     * @throws Exception
     */
    @Test
    public void testMethod1() throws Exception{
        Class clazz = Person.class;

        //1.获取对象
        Person o = (Person) clazz.newInstance();

        //2.获取方法，需要指定名字和形参列表的所有类型(重载)
        Method show = clazz.getDeclaredMethod("show", String.class);

        //3.与上面一样，需要设置
        show.setAccessible(true);

        //4.使用invoke调用对象的show方法，返回值就是对象方法的返回值
        show.invoke(o,"CHN");

        //1.调用静态方法
        Method showDesc = clazz.getDeclaredMethod("showDesc");
        showDesc.setAccessible(true);
        showDesc.invoke(o);
        //2.静态方法可以不用写上特定的对象,写null，上面的静态属性也可以
        showDesc.invoke(null);
    }

    /**
     * 调用特定构造器
     * @throws Exception
     */
    @Test
    public void testConstructor() throws Exception{
        Class clazz = Person.class;

        //1.不同的地方，不需要指明名字，因为逻辑上不需要
        Constructor constructor = clazz.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        //2.调用此构造器创建对象
        Person o = (Person) constructor.newInstance("哈哈哈");

        System.out.println(o);
    }
}
