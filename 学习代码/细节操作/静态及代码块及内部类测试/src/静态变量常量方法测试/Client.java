package 静态变量常量方法测试;

/**
 * @author qgyiimer
 * @create 2021-{05}--19:25
 */
public class Client {
    public static void main(String[] args) {
        //先测试静态变量
        /*
        有继承关系的类，可以有相同名称的静态变量，互不影响。
        它可以在任何地方得到调用！
        好像没什么好测试的！懂静态加载的过程就好了！
         */

        //测试静态方法
        //应该都知道：静态方法中只能调用静态的属性和方法，那Thread.currentThread().getName();又是因为什么可以在静态方法中调用呢？
        //首先，我得到了一个结论，这个情况是只针对于本类中可以用this访问到的东西
        //在调用类里面定义的东西的时候，确实会加上this，而其实还有一种可能是加上类名，来调用静态的东西。
        //而静态方法中就是不能存在this这种东西！就算有，也一定要是静态的东西！
        //换句话说，必须都可以用类名来调用！

        /*
        这里再说一下出现重名的时候，会调用哪一个的问题。
        不说什么重写，重载，记住就近原则就行了！就是网上找，有了就用！除非像加个this.等，显式来调用！
         */

       /*
       说说final关键字：
       final修饰的属性，必须要显式的赋值一次，即便成员变量有默认值。好像常量不会有。
       显式赋值的地方：显式赋值，非代码块中赋值，构造器中赋值
       但是常量变成静态常量后：显式赋值，静态代码块中赋值。
        */
        new SuperMan();
    }

}

class Person {

    public void getS() {

    }
}
class SuperMan extends Person {
    {
        a = 10;
    }
    final int a;

    {
        System.out.println(a);
    }
    SuperMan() {
//        a = 1;
    }
    public void getS(String s) {
//        a = 1;
//        Thread.currentThread().getName();
    }

}