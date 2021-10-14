package 内部类测试;

/**
 * @author qgyiimer
 * @create 2021-{05}--19:58
 */
public class Client {
    public static void main(String[] args) {
        //创建非静态成员内部类，只能用实例化外部类的对象去创建
        TestPerson tp = new TestPerson();
        tp.test();
        TestPerson.Person person = tp.new Person();
        //创建静态成员内部类
//        TestPerson.Person person1 = new TestPerson.Person();

        /*
        这两个方式，互不能共存
         */


    }

}