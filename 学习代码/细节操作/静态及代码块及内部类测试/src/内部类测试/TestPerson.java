package 内部类测试;

/**
 * @author qgyiimer
 * @create 2021-{05}--20:19
 */
public class TestPerson {
    /*
        this关键字：对类的结构上层有的都可以用类名调。
        如：TestPerson.this在其内部类中调
         */
    //成员内部类，可以是静态的，局部内部类不可以
      class Person{
        //与其他的类一样
        public void print() {
            System.out.println("我是成员内部类");
        }
    }
    {
        //局部内部类
        class Person{
            public void print() {
                System.out.println("我是代码块的局部内部类");
            }
        }
        new Person().print();
    }
    public void test() {
        //局部内部类
        class Person{
            public void print() {
                System.out.println("我是函数的局部内部类");
            }
        }
        new Person().print();
        //静态后不能用对象创建
        this.new Person().print();
        //这个是静态和非静态都可以用的
        TestPerson.Person person = new TestPerson.Person();
        person.print();
    }
    TestPerson() {
        class Person{
            public void print() {
                System.out.println("我是TestPerson的局部内部类");
            }
        }
        new Person().print();
    }
}
