package 接口;

/**
 * @author qgyiimer
 * @create 2021-{05}--20:45
 */
public interface Person {
    //默认是全局常量，加上修饰符会显示unnecessary modify,jdk8新引入的！
    int i = 1;

    //所有方法都是有个public前缀的，加了也会显示unnecessary modify

    //加上default就必须加大括号！
    default void test1(){}
    //不加default就不能加大括号,必须加上";"结尾！
    void test2();
    //static必须加大括号！
    static void test3(){}

    //对比抽象类：
    //比他少了成员变量的定义,构造器,final修饰,静态or非静态代码块
    //可以多继承接口。能用接口就用接口，因为类是单继承的。
    //什么时候用接口、抽象类，在实际开发中积累（结合设计模式）
}
