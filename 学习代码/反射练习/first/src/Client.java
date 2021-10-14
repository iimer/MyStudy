import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author qgyiimer
 * @create 2021-{05}--17:43
 */
public class Client {
    @Test
    public void test1() throws Exception {
        Class clazz = Person.class;
        //1.获得构造器
        Constructor constructor = clazz.getConstructor();
        //2.根据构造器创建对象
        Object o = constructor.newInstance();
        Person p = (Person)o;
        System.out.println(p.toString());

        //1.调用对象的属性、方法
        //（1）调用属性
        Field age = clazz.getDeclaredField("age");
        age.set(p,12);
        System.out.println(p);

        //（2）调用方法
        Method show = clazz.getDeclaredMethod("show");
        show.invoke(p);

        System.out.println("----------调用类的私有结构----------");
        //2.调用类的私有结构
        //私有构造方法
        Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class);
        declaredConstructor.setAccessible(true);
        Object qgy = declaredConstructor.newInstance("qgy");
        Person p2 = (Person) qgy;
        System.out.println(p2);

        //私有属性
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p2,"改变后的名字");
        System.out.println(p2);

        //调用私有方法
        Method showNation = clazz.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        String res = (String) showNation.invoke(p2, "中国");
        System.out.println(res);
        //开发时用new，还是反射呢？
        //大部分情况用new，反射主要是动态性的，new的方式编辑器会给出各种提示，易于开发
        //封装性和反射机制矛盾吗？
        //不矛盾。封装性的权限修饰符是逻辑上的体现，跟正常开发的new等是对应的
        //但是如果一定要去调用一些不符逻辑的，也可以调（反射）
    }
    //理解：加载到内存中的类，即运行时类，此时就是Class的一个实例

    /**
     * 获取Class的实例
     * 获取的都是同一个Class实例
     * 问题：怎么打印重写了toString的对象的地址值
     */
    @Test
    public void test2() throws ClassNotFoundException {
        //方式一：通过运行时类的属性。  .class(只能用运行时类调，不能用实例对象)
        Class clazz1= Person.class;
        System.out.println(clazz1);

        //方式二：通过运行时类的对象，getClass()
        Person p1 = new Person();
        Class clazz2 = p1.getClass();
        System.out.println(clazz2);

        //方式三：调用Class的静态方法
        Class clazz3 = Class.forName("Person");
        System.out.println(clazz3);

        //方式四：类的加载器
        ClassLoader classLoader = Client.class.getClassLoader();
        Class clazz4 = classLoader.loadClass("Person");
        System.out.println(clazz4);

        System.out.println(clazz1==clazz2);
        System.out.println(clazz2==clazz3);
        System.out.println(clazz3==clazz4);
    }
    /*
    哪些可以作为Class的实例？
    Class类，其它类，接口，枚举类，注解，void，基本数据类型，数组
     */
}
