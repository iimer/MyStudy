package 第二个包;

import 第二个包.Creature;
import 第二个包.MyAnnotation;
import 第二个包.MyInterface;

/**
 * @author shkstart
 * @create 2019 下午 3:12
 */
@MyAnnotation(value="hi")
public class Person extends Creature<String> implements Comparable<String>, MyInterface {
class Person2{

}
    private String name;
    int age;
    public int id;
    protected String password;
    public static String kk;

    public Person(){}

    @MyAnnotation(value="abc")
    private Person(String name){
        this.name = name;
    }

    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    @MyAnnotation
    private String show(String nation){
        System.out.println("我的国籍是：" + nation);
        return nation;
    }

    public String display(String interests,int age) throws NullPointerException,ClassCastException{
        return interests + age;
    }


    @Override
    public void info() {
        System.out.println("我是一个人");
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }

    private static void showDesc(){
        System.out.println("我是一个可爱的人");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

}
