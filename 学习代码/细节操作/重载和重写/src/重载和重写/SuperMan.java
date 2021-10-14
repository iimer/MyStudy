package 重载和重写;

/**
 * @author qgyiimer
 * @create 2021-{05}--21:13
 */
public class SuperMan extends Person{
    /*
    重写：
    对父类方法的覆盖，在函数名和参数列表相同时就已经确定是重写。此时就必须和父类方法一模一样才行，包括修饰符、返回值类型、是否有异常

    重载：
    对父类或者本类中方法的重载，不影响被重载的方法。
    根据函数名相同和参数列表不同来确定构成重载，此时任何结构都可以发生改变，包括修饰符、返回值类型、是否有异常
     */

    //可变个数形参必须放在最后！否则报错。
    public void go(int i, String... s){
        System.out.println("我能飞！");
    }

}
