package 静态及代码块测试;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author qgyiimer
 * @create 2021-{05}--18:33
 */
public class Client {
    protected int p = 1;
    public static void main(String[] args) throws NoSuchFieldException {
        //代码块会在实例化对象的时候运行，那么会运行父类吗？
        //创建子类对象
//        SuperMan s1 = new SuperMan();
//        Person p1 = new Person();
        //结论：会。先执行父类的再执行子类的，说明创建子类也创建了父类

        //静态代码块随着类的加载而加载，父类也会先执行吗？
        //结论：是的，但是现在看来（后面会扩充），不实例化的话不会在运行的时候执行其中的代码。即想要全部执行，要去实例化子类
        //静态代码块只执行一次！实例化子类+父类的执行结果：
        /*
            我是一个正常人，我还是一个静态的正常人
            我是超人，我还是个静态的超人
            我是一个正常人
            我是超人，我会飞
            我是一个正常人
         */

        //既然知道了静态的加载会从父到子，就做些别的测试
        //静态的代码块会先于这个语句完全执行。并且只要用到了这个类，就会调用静态代码块，不需要实例化！
        //前半句
//        System.out.println(Person.a);

        //使用反射不会有这个静态代码块的执行！
//        System.out.println(SuperMan.class.getSuperclass().getDeclaredField("a"));

        //从结果得知：同是静态的会按照顺序执行
//        System.out.println(SuperMan.a);
        /*
        输出：
        我是一个正常人，我还是一个静态的正常人
        11
        4
        我是超人，我还是个静态的超人
        4
         */

        /*
        总结下静态：
        静态的会在被类调用，实例化的时候加载。先父后子、按前后顺序执行。且执行一次。

        总结下实例化的操作：
        不谈静态，上面已经说得很清楚，这里只说它特有的。
        会从父到子进行实例化,为了排除不是代码块自带的从父到子，改变下结构测试下。把子类代码块注释掉，然后实例化子类！
         */
//        SuperMan s2 = new SuperMan();
        /*
        此时还是会同样的去执行父类的代码块，所以应该很大概率就是从父到子都实例化了！
        加上刚刚在父类中new子类对象产生的<init>的stackoverflow，百分百确定了！
        输出：
        我是一个正常人，我还是一个静态的正常人
        我是一个正常人
         */

        /*
        拉回来，继续总结：
        总结下代码块：
        代码块是随着创建类的对象时才会执行的，在静态执行的后面。在构造器的前面。
         */
    }

}

class Person {
    //<init>的stackoverflow，因为会无限循环创建子类-->父类--->子类
//    SuperMan s = new SuperMan();
    static int a = 10;
    int n = 0;
    {
        System.out.println("我是一个正常人");
    }

    static {
        System.out.println("我是一个正常人，我还是一个静态的正常人");
    }
}
class SuperMan extends Person{
    static int a = 11;
    int n = 1;

//    static {
//        System.out.println(a);
//        a = 4;
//        System.out.println(a);
//    }
//    {
//
//        System.out.println("我是超人，我会飞");
//    }
//
//    static {
//        System.out.println("我是超人，我还是个静态的超人");
//    }
}
